package cq;

import ek.u;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f13047b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f13048c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f13049d;

    public /* synthetic */ c(e eVar, Runnable runnable, u uVar, int i10) {
        this.f13046a = i10;
        this.f13047b = eVar;
        this.f13048c = runnable;
        this.f13049d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f13046a;
        final u uVar = this.f13049d;
        final Runnable runnable = this.f13048c;
        e eVar = this.f13047b;
        switch (i10) {
            case 0:
                eVar.getClass();
                final int i11 = 0;
                eVar.f13053a.execute(new Runnable() { // from class: cq.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i12 = i11;
                        u uVar2 = uVar;
                        Runnable runnable2 = runnable;
                        switch (i12) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    uVar2.E(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    g gVar = (g) uVar2.f15627b;
                                    int i13 = g.f13055i;
                                    gVar.getClass();
                                    if (a3.i.f154f.r(gVar, null, a3.i.f155g)) {
                                        a3.i.d(gVar);
                                        return;
                                    }
                                    return;
                                } catch (Exception e11) {
                                    uVar2.E(e11);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e12) {
                                    uVar2.E(e12);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                eVar.getClass();
                final int i12 = 2;
                eVar.f13053a.execute(new Runnable() { // from class: cq.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i122 = i12;
                        u uVar2 = uVar;
                        Runnable runnable2 = runnable;
                        switch (i122) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    uVar2.E(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    g gVar = (g) uVar2.f15627b;
                                    int i13 = g.f13055i;
                                    gVar.getClass();
                                    if (a3.i.f154f.r(gVar, null, a3.i.f155g)) {
                                        a3.i.d(gVar);
                                        return;
                                    }
                                    return;
                                } catch (Exception e11) {
                                    uVar2.E(e11);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e12) {
                                    uVar2.E(e12);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                eVar.getClass();
                final int i13 = 1;
                eVar.f13053a.execute(new Runnable() { // from class: cq.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i122 = i13;
                        u uVar2 = uVar;
                        Runnable runnable2 = runnable;
                        switch (i122) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    uVar2.E(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    g gVar = (g) uVar2.f15627b;
                                    int i132 = g.f13055i;
                                    gVar.getClass();
                                    if (a3.i.f154f.r(gVar, null, a3.i.f155g)) {
                                        a3.i.d(gVar);
                                        return;
                                    }
                                    return;
                                } catch (Exception e11) {
                                    uVar2.E(e11);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e12) {
                                    uVar2.E(e12);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
