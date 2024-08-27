package m5;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;

/* loaded from: classes.dex */
public final class t implements OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27588a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27589b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27590c;

    public /* synthetic */ t(String str, String str2, int i10) {
        this.f27588a = i10;
        this.f27589b = str;
        this.f27590c = str2;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.w(this.f27589b, this.f27590c, exc);
    }

    public final String toString() {
        switch (this.f27588a) {
            case 0:
                return this.f27589b + ", " + this.f27590c;
            default:
                return super.toString();
        }
    }
}
