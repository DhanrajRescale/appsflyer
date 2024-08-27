package c2;

import d2.j3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.m3;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public static final i f7716b = new i(0);

    /* renamed from: c, reason: collision with root package name */
    public static final i f7717c = new i(3);

    /* renamed from: d, reason: collision with root package name */
    public static final i f7718d = new i(4);

    /* renamed from: e, reason: collision with root package name */
    public static final i f7719e = new i(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7720a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10) {
        super(2);
        this.f7720a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [g1.n] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [v0.h] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7720a) {
            case 0:
                ((Number) obj2).intValue();
                ((l) obj).getClass();
                return Unit.f23355a;
            case 1:
                ((androidx.compose.ui.node.a) ((l) obj)).W((w2.b) obj2);
                return Unit.f23355a;
            case 2:
                w2.k kVar = (w2.k) obj2;
                androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) ((l) obj);
                if (aVar.f1418s != kVar) {
                    aVar.f1418s = kVar;
                    aVar.z();
                    androidx.compose.ui.node.a q10 = aVar.q();
                    if (q10 != null) {
                        q10.x();
                    }
                    aVar.y();
                }
                return Unit.f23355a;
            case 3:
                ((androidx.compose.ui.node.a) ((l) obj)).Y((a2.m0) obj2);
                return Unit.f23355a;
            case 4:
                ((androidx.compose.ui.node.a) ((l) obj)).Z((g1.o) obj2);
                return Unit.f23355a;
            case 5:
                t0.c0 c0Var = (t0.c0) obj2;
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) ((l) obj);
                aVar2.f1420u = c0Var;
                m3 m3Var = d2.s1.f13620e;
                b1.g gVar = (b1.g) c0Var;
                gVar.getClass();
                aVar2.W((w2.b) al.d.L0(gVar, m3Var));
                w2.k kVar2 = (w2.k) al.d.L0(gVar, d2.s1.f13626k);
                if (aVar2.f1418s != kVar2) {
                    aVar2.f1418s = kVar2;
                    aVar2.z();
                    androidx.compose.ui.node.a q11 = aVar2.q();
                    if (q11 != null) {
                        q11.x();
                    }
                    aVar2.y();
                }
                aVar2.a0((j3) al.d.L0(gVar, d2.s1.f13631p));
                g1.n nVar = aVar2.f1422w.f7658e;
                if ((nVar.f16408d & 32768) != 0) {
                    while (nVar != null) {
                        if ((nVar.f16407c & 32768) != 0) {
                            o oVar = nVar;
                            ?? r22 = 0;
                            while (oVar != 0) {
                                if (oVar instanceof m) {
                                    g1.n nVar2 = ((g1.n) ((m) oVar)).f16405a;
                                    if (nVar2.f16417m) {
                                        g.k(nVar2);
                                    } else {
                                        nVar2.f16414j = true;
                                    }
                                } else if ((oVar.f16407c & 32768) != 0 && (oVar instanceof o)) {
                                    g1.n nVar3 = oVar.f7801o;
                                    int i10 = 0;
                                    oVar = oVar;
                                    r22 = r22;
                                    while (nVar3 != null) {
                                        if ((nVar3.f16407c & 32768) != 0) {
                                            i10++;
                                            r22 = r22;
                                            if (i10 == 1) {
                                                oVar = nVar3;
                                            } else {
                                                if (r22 == 0) {
                                                    r22 = new v0.h(new g1.n[16]);
                                                }
                                                if (oVar != 0) {
                                                    r22.b(oVar);
                                                    oVar = 0;
                                                }
                                                r22.b(nVar3);
                                            }
                                        }
                                        nVar3 = nVar3.f16410f;
                                        oVar = oVar;
                                        r22 = r22;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                oVar = g.f(r22);
                            }
                        }
                        if ((nVar.f16408d & 32768) != 0) {
                            nVar = nVar.f16410f;
                        }
                    }
                }
                return Unit.f23355a;
            default:
                ((androidx.compose.ui.node.a) ((l) obj)).a0((j3) obj2);
                return Unit.f23355a;
        }
    }
}
