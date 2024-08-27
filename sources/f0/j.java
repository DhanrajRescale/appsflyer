package f0;

import a2.u;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;
import ut.l;
import x.z;
import y.p;
import y.s;

/* loaded from: classes.dex */
public final class j extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f15889a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f15890b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f15891c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f15892d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, u uVar, Function0 function0, yt.a aVar) {
        super(2, aVar);
        this.f15890b = mVar;
        this.f15891c = uVar;
        this.f15892d = function0;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j(this.f15890b, this.f15891c, this.f15892d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f15889a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            m mVar = this.f15890b;
            h hVar = mVar.f15901p;
            i iVar = new i(mVar, this.f15891c, this.f15892d);
            this.f15889a = 1;
            s sVar = (s) hVar;
            sVar.getClass();
            m1.d dVar = (m1.d) iVar.mo2invoke();
            if (dVar != null && !sVar.S0(sVar.f40931w, dVar)) {
                qu.i iVar2 = new qu.i(1, zt.f.b(this));
                iVar2.s();
                p pVar = new p(iVar, iVar2);
                y.l lVar = sVar.f40926r;
                lVar.getClass();
                m1.d dVar2 = (m1.d) iVar.mo2invoke();
                if (dVar2 == null) {
                    l.Companion companion = ut.l.INSTANCE;
                    iVar2.resumeWith(Unit.f23355a);
                } else {
                    iVar2.u(new z(3, lVar, pVar));
                    v0.h hVar2 = lVar.f40834a;
                    int i11 = new kotlin.ranges.c(0, hVar2.f37655c - 1, 1).f23382b;
                    if (i11 >= 0) {
                        while (true) {
                            m1.d dVar3 = (m1.d) ((p) hVar2.f37653a[i11]).f40880a.mo2invoke();
                            if (dVar3 != null) {
                                m1.d d10 = dVar2.d(dVar3);
                                if (Intrinsics.a(d10, dVar2)) {
                                    hVar2.a(i11 + 1, pVar);
                                    break;
                                }
                                if (!Intrinsics.a(d10, dVar3)) {
                                    CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                    int i12 = hVar2.f37655c - 1;
                                    if (i12 <= i11) {
                                        while (true) {
                                            ((p) hVar2.f37653a[i11]).f40881b.r(cancellationException);
                                            if (i12 == i11) {
                                                break;
                                            }
                                            i12++;
                                        }
                                    }
                                }
                            }
                            if (i11 == 0) {
                                break;
                            }
                            i11--;
                        }
                    }
                    hVar2.a(0, pVar);
                    if (!sVar.f40932x) {
                        sVar.T0();
                    }
                }
                obj2 = iVar2.p();
                zt.a aVar2 = zt.a.f42823a;
                if (obj2 == aVar2) {
                    Intrinsics.checkNotNullParameter(this, "frame");
                }
                if (obj2 != aVar2) {
                    obj2 = Unit.f23355a;
                }
            } else {
                obj2 = Unit.f23355a;
            }
            if (obj2 == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
