package in.juspay.hypersdk.core;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20203b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20204c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f20205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f20206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f20207f;

    public /* synthetic */ a(AndroidInterface androidInterface, JSONObject jSONObject, String str, String str2, String str3) {
        this.f20202a = 1;
        this.f20203b = androidInterface;
        this.f20207f = jSONObject;
        this.f20204c = str;
        this.f20205d = str2;
        this.f20206e = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20202a;
        String str = this.f20205d;
        String str2 = this.f20204c;
        Object obj = this.f20207f;
        String str3 = this.f20206e;
        Object obj2 = this.f20203b;
        switch (i10) {
            case 0:
                AndroidInterface.h((AndroidInterface) obj2, str2, str, str3, (String) obj);
                return;
            case 1:
                AndroidInterface.i((AndroidInterface) obj2, (JSONObject) obj, str2, str, str3);
                return;
            case 2:
                SdkTracker.g((SdkTracker) obj2, str2, str, str3, (JSONObject) obj);
                return;
            case 3:
                SdkTracker.f(str2, str, str3, (String) obj, (Throwable) obj2);
                return;
            default:
                SdkTracker.r((SdkTracker) obj2, str2, str, str3, obj);
                return;
        }
    }

    public /* synthetic */ a(Object obj, String str, String str2, String str3, Object obj2, int i10) {
        this.f20202a = i10;
        this.f20203b = obj;
        this.f20204c = str;
        this.f20205d = str2;
        this.f20206e = str3;
        this.f20207f = obj2;
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, Throwable th2) {
        this.f20202a = 3;
        this.f20204c = str;
        this.f20205d = str2;
        this.f20206e = str3;
        this.f20207f = str4;
        this.f20203b = th2;
    }
}
