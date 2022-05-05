package com.example.myfirstapp

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class WebviewActivity : AppCompatActivity() {

    private lateinit var mWvMain: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        mWvMain = findViewById(R.id.wv)
        // 加载本地HTML
//        mWvMain.loadUrl("file:///android_asset/test.html")
        // 加载网络URL
        mWvMain.settings.javaScriptEnabled = true
        mWvMain.webViewClient = MyWebViewClient()
        mWvMain.webChromeClient = MyWebChromeClient()
        mWvMain.loadUrl("https://m.baidu.com")


    }

    class MyWebViewClient : WebViewClient() {
        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
            view?.loadUrl(request?.url.toString())
            return super.shouldOverrideUrlLoading(view, request)
        }

        override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
            super.onPageStarted(view, url, favicon)
            Log.d("WebView", "onPageStarted...")
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            Log.d("WebView", "onPageFinished...")
        }
    }

    class MyWebChromeClient : WebChromeClient() {
        override fun onProgressChanged(view: WebView?, newProgress: Int) {
            super.onProgressChanged(view, newProgress)
        }

        override fun onReceivedTitle(view: WebView?, title: String?) {
            super.onReceivedTitle(view, title)
        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK && mWvMain.canGoBack()) {
            mWvMain.goBack()
            return true
        }
        return super.onKeyDown(keyCode, event)
    }
}