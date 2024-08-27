package j2;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20738a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f20739b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i10) {
        super(0);
        this.f20738a = i10;
        this.f20739b = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final Float a() {
        r rVar;
        r rVar2;
        int i10 = this.f20738a;
        float f10 = s0.g.f34069a;
        q qVar = null;
        n nVar = this.f20739b;
        int i11 = 1;
        switch (i10) {
            case 0:
                ArrayList arrayList = nVar.f20744e;
                if (!arrayList.isEmpty()) {
                    ?? r22 = arrayList.get(0);
                    float c10 = ((q) r22).f20752a.c();
                    int f11 = vt.y.f(arrayList);
                    boolean z10 = r22;
                    if (1 <= f11) {
                        while (true) {
                            Object obj = arrayList.get(i11);
                            float c11 = ((q) obj).f20752a.c();
                            r22 = z10;
                            if (Float.compare(c10, c11) < 0) {
                                r22 = obj;
                                c10 = c11;
                            }
                            if (i11 != f11) {
                                i11++;
                                z10 = r22;
                            }
                        }
                    }
                    qVar = r22;
                }
                q qVar2 = qVar;
                if (qVar2 != null && (rVar = qVar2.f20752a) != null) {
                    f10 = rVar.c();
                }
                return Float.valueOf(f10);
            default:
                ArrayList arrayList2 = nVar.f20744e;
                if (!arrayList2.isEmpty()) {
                    ?? r23 = arrayList2.get(0);
                    float b10 = ((q) r23).f20752a.b();
                    int f12 = vt.y.f(arrayList2);
                    boolean z11 = r23;
                    if (1 <= f12) {
                        while (true) {
                            Object obj2 = arrayList2.get(i11);
                            float b11 = ((q) obj2).f20752a.b();
                            r23 = z11;
                            if (Float.compare(b10, b11) < 0) {
                                r23 = obj2;
                                b10 = b11;
                            }
                            if (i11 != f12) {
                                i11++;
                                z11 = r23;
                            }
                        }
                    }
                    qVar = r23;
                }
                q qVar3 = qVar;
                if (qVar3 != null && (rVar2 = qVar3.f20752a) != null) {
                    f10 = rVar2.b();
                }
                return Float.valueOf(f10);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f20738a) {
            case 0:
                return a();
            default:
                return a();
        }
    }
}
