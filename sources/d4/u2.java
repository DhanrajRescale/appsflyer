package d4;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class u2 {

    /* renamed from: a, reason: collision with root package name */
    public final d3 f13842a;

    /* renamed from: b, reason: collision with root package name */
    public u3.c[] f13843b;

    public u2() {
        this(new d3());
    }

    public final void a() {
        u3.c[] cVarArr = this.f13843b;
        if (cVarArr != null) {
            u3.c cVar = cVarArr[qu.i0.y(1)];
            u3.c cVar2 = this.f13843b[qu.i0.y(2)];
            d3 d3Var = this.f13842a;
            if (cVar2 == null) {
                cVar2 = d3Var.f13731a.f(2);
            }
            if (cVar == null) {
                cVar = d3Var.f13731a.f(1);
            }
            g(u3.c.a(cVar, cVar2));
            u3.c cVar3 = this.f13843b[qu.i0.y(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            u3.c cVar4 = this.f13843b[qu.i0.y(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            u3.c cVar5 = this.f13843b[qu.i0.y(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    @NonNull
    public abstract d3 b();

    public void c(int i10, @NonNull u3.c cVar) {
        if (this.f13843b == null) {
            this.f13843b = new u3.c[9];
        }
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.f13843b[qu.i0.y(i11)] = cVar;
            }
        }
    }

    public void d(@NonNull u3.c cVar) {
    }

    public abstract void e(@NonNull u3.c cVar);

    public void f(@NonNull u3.c cVar) {
    }

    public abstract void g(@NonNull u3.c cVar);

    public void h(@NonNull u3.c cVar) {
    }

    public u2(@NonNull d3 d3Var) {
        this.f13842a = d3Var;
    }
}
