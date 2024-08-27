package t3;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f35319b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35320c;

    public /* synthetic */ m(int i10, int i11, Object obj) {
        this.f35318a = i11;
        this.f35320c = obj;
        this.f35319b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f35318a;
        int i11 = this.f35319b;
        Object obj = this.f35320c;
        switch (i10) {
            case 0:
                ((b) obj).e(i11);
                return;
            case 1:
                i5.e eVar = ((i5.c) obj).f19382b;
                eVar.getClass();
                boolean z10 = true;
                if (i11 != -3 && i11 != -2) {
                    if (i11 != -1) {
                        if (i11 != 1) {
                            nn.d.u("Unknown focus change type: ", i11, "AudioFocusManager");
                            return;
                        } else {
                            eVar.d(1);
                            eVar.b(1);
                            return;
                        }
                    }
                    eVar.b(-1);
                    eVar.a();
                    return;
                }
                if (i11 != -2) {
                    b5.g gVar = eVar.f19397d;
                    if (gVar == null || gVar.f3298a != 1) {
                        z10 = false;
                    }
                    if (!z10) {
                        eVar.d(3);
                        return;
                    }
                }
                eVar.b(0);
                eVar.d(2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.f11424o.get();
                if (view != null) {
                    sideSheetBehavior.u(view, i11, false);
                    return;
                }
                return;
        }
    }
}
