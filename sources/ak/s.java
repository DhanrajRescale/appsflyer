package ak;

/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f569a;

    /* renamed from: b, reason: collision with root package name */
    public final nk.f f570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f571c;

    public /* synthetic */ s(v vVar, nk.f fVar, int i10) {
        this.f569a = i10;
        this.f571c = vVar;
        this.f570b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d dVar;
        switch (this.f569a) {
            case 0:
                nk.g gVar = (nk.g) this.f570b;
                gVar.f28794b.a();
                synchronized (gVar.f28795c) {
                    synchronized (this.f571c) {
                        try {
                            u uVar = this.f571c.f576a;
                            nk.f fVar = this.f570b;
                            uVar.getClass();
                            if (uVar.f574a.contains(new t(fVar, rk.e.f33939b))) {
                                v vVar = this.f571c;
                                nk.f fVar2 = this.f570b;
                                vVar.getClass();
                                try {
                                    ((nk.g) fVar2).l(vVar.f595t, 5);
                                } finally {
                                }
                            }
                            this.f571c.c();
                        } finally {
                        }
                    }
                }
                return;
            default:
                nk.g gVar2 = (nk.g) this.f570b;
                gVar2.f28794b.a();
                synchronized (gVar2.f28795c) {
                    synchronized (this.f571c) {
                        try {
                            u uVar2 = this.f571c.f576a;
                            nk.f fVar3 = this.f570b;
                            uVar2.getClass();
                            if (uVar2.f574a.contains(new t(fVar3, rk.e.f33939b))) {
                                this.f571c.f597v.a();
                                v vVar2 = this.f571c;
                                nk.f fVar4 = this.f570b;
                                vVar2.getClass();
                                try {
                                    nk.g gVar3 = (nk.g) fVar4;
                                    gVar3.n(vVar2.f593r, vVar2.f597v);
                                    this.f571c.h(this.f570b);
                                } finally {
                                }
                            }
                            this.f571c.c();
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
