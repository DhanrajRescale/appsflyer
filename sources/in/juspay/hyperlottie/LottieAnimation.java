package in.juspay.hyperlottie;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import in.juspay.hyper.core.FileProviderInterface;
import in.juspay.hyper.core.JsCallback;
import in.juspay.hyperlottie.LottieAnimation;
import j9.a0;
import j9.f;
import j9.i;
import j9.o;
import j9.y;
import java.util.WeakHashMap;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;
import s0.g;

/* loaded from: classes2.dex */
public class LottieAnimation {
    private static final String ALPHA = "lottieAlpha";
    private static final String LottieURL = "lottieUrl";
    private static final String MAX_FRAME = "maxFrame";
    private static final String MAX_PROGRESS = "maxProgress";
    private static final String MIN_FRAME = "minFrame";
    private static final String MIN_PROGRESS = "minProgress";
    private static final String REPEAT_COUNT = "repeatCount";
    private static final String REPEAT_MODE = "repeatMode";
    private static final String SAFE_MODE = "safeMode";
    private static final String SPEED = "speed";
    private static final String StartLottie = "startLottie";

    @NonNull
    private final Context context;

    @NonNull
    private final JsCallback dynamicUI;

    @NonNull
    private final FileProviderInterface fileProviderservice;
    private final WeakHashMap<String, String> jsonStringCache = new WeakHashMap<>();

    public LottieAnimation(@NonNull Context context, @NonNull JsCallback jsCallback, @NonNull FileProviderInterface fileProviderInterface) {
        this.context = context;
        this.fileProviderservice = fileProviderInterface;
        this.dynamicUI = jsCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$applyAnimation$0(y yVar, View view, boolean z10, i iVar) {
        yVar.m(iVar);
        view.setBackground(yVar);
        if (z10) {
            yVar.start();
        } else {
            yVar.stop();
        }
    }

    public void applyAnimation(Object obj, JSONArray jSONArray) {
        final y yVar;
        int optInt;
        int optInt2;
        int optInt3;
        int i10;
        String readFromFile;
        try {
            if (!(obj instanceof View)) {
                return;
            }
            final View view = (View) obj;
            if (jSONArray.length() == 0) {
                if (view.getBackground() instanceof y) {
                    view.setBackground(null);
                    return;
                }
                return;
            }
            if (jSONArray.length() > 1) {
                this.dynamicUI.addJsToWebView("console.log(\"LottieAnimations Array is > 1\");");
            }
            JSONObject jSONObject = jSONArray.getJSONObject(jSONArray.length() - 1);
            if (jSONObject == null) {
                return;
            }
            final boolean optBoolean = jSONObject.optBoolean(StartLottie, true);
            if (jSONObject.has(LottieURL)) {
                String string = jSONObject.getString(LottieURL);
                if (this.jsonStringCache.containsKey(string)) {
                    readFromFile = this.jsonStringCache.get(string);
                } else {
                    readFromFile = this.fileProviderservice.readFromFile(this.context, string);
                    if (readFromFile != null && readFromFile.length() != 0) {
                        this.jsonStringCache.put(string, readFromFile);
                    }
                    return;
                }
                yVar = new y();
                o.a(string, new f(readFromFile, string)).b(new a0() { // from class: ys.a
                    @Override // j9.a0
                    public final void onResult(Object obj2) {
                        LottieAnimation.lambda$applyAnimation$0(y.this, view, optBoolean, (i) obj2);
                    }
                });
            } else if (view.getBackground() instanceof y) {
                yVar = (y) view.getBackground();
            } else {
                return;
            }
            if (jSONObject.has(REPEAT_MODE)) {
                if ("reverse".equals(jSONObject.optString(REPEAT_MODE, HttpUrl.FRAGMENT_ENCODE_SET))) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                yVar.f21225b.setRepeatMode(i10);
            }
            if (jSONObject.has(REPEAT_COUNT)) {
                int optInt4 = jSONObject.optInt(REPEAT_COUNT, 0);
                if (optInt4 < 0) {
                    yVar.f21225b.setRepeatCount(-1);
                } else {
                    yVar.f21225b.setRepeatCount(optInt4);
                }
            }
            if (jSONObject.has(SPEED)) {
                yVar.f21225b.f38879d = (float) jSONObject.optDouble(SPEED, 1.0d);
            }
            if (jSONObject.has(MIN_FRAME) && (optInt3 = jSONObject.optInt(MIN_FRAME, 0)) >= 0) {
                yVar.u(optInt3);
            }
            if (jSONObject.has(MAX_FRAME) && (optInt2 = jSONObject.optInt(MAX_FRAME, 0)) >= 0) {
                yVar.o(optInt2);
            }
            if (jSONObject.has(MIN_PROGRESS)) {
                float optDouble = (float) jSONObject.optDouble(MIN_PROGRESS, 0.0d);
                if (g.f34069a <= optDouble && optDouble <= 1.0f) {
                    yVar.w(optDouble);
                }
            }
            if (jSONObject.has(MAX_PROGRESS)) {
                float optDouble2 = (float) jSONObject.optDouble(MAX_PROGRESS, 0.0d);
                if (g.f34069a <= optDouble2 && optDouble2 <= 1.0f) {
                    yVar.q(optDouble2);
                }
            }
            if (jSONObject.has(SAFE_MODE)) {
                yVar.f21228e = jSONObject.optBoolean(SAFE_MODE, false);
            }
            if (jSONObject.has(ALPHA) && (optInt = jSONObject.optInt(ALPHA, 255)) >= 0 && optInt <= 255) {
                yVar.setAlpha(optInt);
            }
            if (optBoolean) {
                yVar.start();
            } else {
                yVar.stop();
            }
        } catch (Exception unused) {
        }
    }
}
