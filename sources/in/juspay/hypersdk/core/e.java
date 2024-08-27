package in.juspay.hypersdk.core;

import android.animation.ObjectAnimator;
import android.util.Pair;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20230b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20231c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f20232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20233e;

    public /* synthetic */ e(AndroidInterface androidInterface, Object obj, String str, String str2, int i10) {
        this.f20229a = i10;
        this.f20230b = androidInterface;
        this.f20233e = obj;
        this.f20231c = str;
        this.f20232d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f20229a;
        String str = this.f20232d;
        String str2 = this.f20231c;
        Object obj = this.f20233e;
        Object obj2 = this.f20230b;
        switch (i10) {
            case 0:
                ((AndroidInterface) obj2).lambda$cancelAnim$18((ObjectAnimator) obj, str2, str);
                return;
            case 1:
                ((AndroidInterface) obj2).lambda$startAnim$17((Pair) obj, str2, str);
                return;
            case 2:
                ((AndroidInterface) obj2).lambda$moveView$5(str2, str, (String) obj);
                return;
            case 3:
                ((AndroidInterface) obj2).lambda$prepareAndStoreView$2(str2, (JSONObject) obj, str);
                return;
            case 4:
                ((DuiInterface) obj2).lambda$runInJuspayBrowser$4(str2, str, (SdkTracker) obj);
                return;
            default:
                ((JBridge) obj2).lambda$startDatePicker$6(str2, str, (String) obj);
                return;
        }
    }

    public /* synthetic */ e(AndroidInterface androidInterface, String str, JSONObject jSONObject, String str2) {
        this.f20229a = 3;
        this.f20230b = androidInterface;
        this.f20231c = str;
        this.f20233e = jSONObject;
        this.f20232d = str2;
    }

    public /* synthetic */ e(Object obj, String str, String str2, Object obj2, int i10) {
        this.f20229a = i10;
        this.f20230b = obj;
        this.f20231c = str;
        this.f20232d = str2;
        this.f20233e = obj2;
    }
}
