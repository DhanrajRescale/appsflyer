package in.juspay.hypersdk.core;

import android.graphics.drawable.Drawable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20270a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20271b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20272c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20274e;

    public /* synthetic */ j(AndroidInterface androidInterface, String str, int i10, JSONArray jSONArray) {
        this.f20271b = androidInterface;
        this.f20272c = str;
        this.f20273d = i10;
        this.f20274e = jSONArray;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20270a;
        int i11 = this.f20273d;
        Object obj = this.f20274e;
        Object obj2 = this.f20272c;
        Object obj3 = this.f20271b;
        switch (i10) {
            case 0:
                ((AndroidInterface) obj3).lambda$updateAnim$19((String) obj2, i11, (JSONArray) obj);
                return;
            case 1:
                ((AndroidInterface) obj3).lambda$replaceView$4((String) obj2, (JSONObject) obj, i11);
                return;
            default:
                ((JBridge) obj3).lambda$drawIcon$2(i11, (Drawable) obj2, (SdkTracker) obj);
                return;
        }
    }

    public /* synthetic */ j(AndroidInterface androidInterface, String str, JSONObject jSONObject, int i10) {
        this.f20271b = androidInterface;
        this.f20272c = str;
        this.f20274e = jSONObject;
        this.f20273d = i10;
    }

    public /* synthetic */ j(JBridge jBridge, int i10, Drawable drawable, SdkTracker sdkTracker) {
        this.f20271b = jBridge;
        this.f20273d = i10;
        this.f20272c = drawable;
        this.f20274e = sdkTracker;
    }
}
