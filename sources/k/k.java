package k;

import android.view.View;
import d4.c2;
import d4.d2;
import m.w3;

/* loaded from: classes.dex */
public final class k extends d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21797a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21798b;

    /* renamed from: c, reason: collision with root package name */
    public int f21799c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21800d;

    public k(l lVar) {
        this.f21797a = 0;
        this.f21800d = lVar;
        this.f21798b = false;
        this.f21799c = 0;
    }

    @Override // d4.d2, d4.c2
    public final void a(View view) {
        switch (this.f21797a) {
            case 1:
                this.f21798b = true;
                return;
            default:
                return;
        }
    }

    @Override // d4.d2, d4.c2
    public final void b() {
        int i10 = this.f21797a;
        Object obj = this.f21800d;
        switch (i10) {
            case 0:
                if (!this.f21798b) {
                    this.f21798b = true;
                    c2 c2Var = ((l) obj).f21804d;
                    if (c2Var != null) {
                        c2Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((w3) obj).f25780a.setVisibility(0);
                return;
        }
    }

    @Override // d4.c2
    public final void c() {
        int i10 = this.f21797a;
        Object obj = this.f21800d;
        switch (i10) {
            case 0:
                int i11 = this.f21799c + 1;
                this.f21799c = i11;
                l lVar = (l) obj;
                if (i11 == lVar.f21801a.size()) {
                    c2 c2Var = lVar.f21804d;
                    if (c2Var != null) {
                        c2Var.c();
                    }
                    this.f21799c = 0;
                    this.f21798b = false;
                    lVar.f21805e = false;
                    return;
                }
                return;
            default:
                if (!this.f21798b) {
                    ((w3) obj).f25780a.setVisibility(this.f21799c);
                    return;
                }
                return;
        }
    }

    public k(w3 w3Var, int i10) {
        this.f21797a = 1;
        this.f21800d = w3Var;
        this.f21799c = i10;
        this.f21798b = false;
    }
}
