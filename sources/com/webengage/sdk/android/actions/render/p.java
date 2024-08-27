package com.webengage.sdk.android.actions.render;

import android.app.Activity;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.webengage.sdk.android.Logger;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    WebView f12418a;

    /* renamed from: b, reason: collision with root package name */
    String f12419b;

    /* renamed from: c, reason: collision with root package name */
    String f12420c;

    /* renamed from: d, reason: collision with root package name */
    String f12421d;

    /* renamed from: e, reason: collision with root package name */
    h f12422e;

    /* renamed from: f, reason: collision with root package name */
    WeakReference<Activity> f12423f;

    /* renamed from: g, reason: collision with root package name */
    private String f12424g = "<!DOCTYPE html>\n<html>\n  <head>\n    <meta charset='UTF-8'>\n    <title>Full Page Modal In-App</title>\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n  </head>\n  <body style = \"background-color: transparent\">\n      <script type='text/javascript'>\n        \n        var webengage = {};\n\n        webengage.notification = {\n\t       \n         'x' : 1\n        \n        };\n\n        var instance = {\n\n          layoutId : WebEngage.getLayoutId(),\n\n previewJson : true ,          baseURL: \"";

    /* renamed from: h, reason: collision with root package name */
    private String f12425h = "\",\n\n\t        data : JSON.parse(WebEngage.getData()),\n\n\t        click : function (actionId,actionLink,isPrime) {\n\t           WebEngage.onClick(actionId,actionLink,isPrime);\n\t        },\n\n          close : function (){\n             WebEngage.onClose();\n          },\n\n          open : function(){\n             WebEngage.onOpen();\n          },\n\n          error : function(stackTrace){\n             WebEngage.onError(stackTrace);\n          }\n\n        };\n      </script>\n      <script type='text/javascript' src='";

    /* renamed from: i, reason: collision with root package name */
    private String f12426i = "js/notification-prepare.js'></script>\n      <script type='text/javascript'>\n       var notificationInstance = webengage.notification.prepare(instance);\n       notificationInstance.show();\n      </script>\n  </body>\n</html>\n";

    /* renamed from: j, reason: collision with root package name */
    private String f12427j;

    /* loaded from: classes2.dex */
    public class b extends WebChromeClient {
        private b() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.d("WebEngage", "onConsoleMessage: " + consoleMessage.message());
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            super.onProgressChanged(webView, i10);
        }
    }

    public p(String str, String str2, String str3, h hVar, Activity activity, JSONObject jSONObject) {
        this.f12427j = null;
        this.f12419b = str;
        this.f12420c = str2;
        this.f12421d = str3;
        this.f12422e = hVar;
        this.f12423f = new WeakReference<>(activity);
        this.f12418a = new WebView(activity);
        this.f12418a.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f12427j = this.f12424g + str + this.f12425h + str + this.f12426i;
    }

    public WebView a() {
        this.f12418a.getSettings().setJavaScriptEnabled(true);
        this.f12418a.getSettings().setPluginState(WebSettings.PluginState.ON);
        this.f12418a.getSettings().setPluginState(WebSettings.PluginState.ON_DEMAND);
        this.f12418a.getSettings().setCacheMode(-1);
        this.f12418a.addJavascriptInterface(this.f12422e, "WebEngage");
        this.f12418a.setWebChromeClient(new b());
        this.f12418a.loadDataWithBaseURL(this.f12419b, this.f12427j, this.f12420c, this.f12421d, null);
        this.f12418a.setBackgroundColor(0);
        this.f12418a.getSettings().setTextZoom(100);
        return this.f12418a;
    }
}
