package x;

import android.widget.EdgeEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class o extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f39647a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar) {
        super(1);
        this.f39647a = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j10 = ((w2.j) obj).f38798a;
        long i12 = hl.f.i1(j10);
        p pVar = this.f39647a;
        boolean z10 = !m1.f.b(i12, pVar.f39667g);
        pVar.f39667g = hl.f.i1(j10);
        if (z10) {
            s0 s0Var = pVar.f39663c;
            s0Var.f39708c = j10;
            EdgeEffect edgeEffect = s0Var.f39709d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (j10 >> 32), (int) (j10 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = s0Var.f39710e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (j10 >> 32), (int) (j10 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = s0Var.f39711f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (j10 & 4294967295L), (int) (j10 >> 32));
            }
            EdgeEffect edgeEffect4 = s0Var.f39712g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (j10 & 4294967295L), (int) (j10 >> 32));
            }
            EdgeEffect edgeEffect5 = s0Var.f39713h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (j10 >> 32), (int) (j10 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = s0Var.f39714i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (j10 >> 32), (int) (j10 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = s0Var.f39715j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (j10 & 4294967295L), (int) (j10 >> 32));
            }
            EdgeEffect edgeEffect8 = s0Var.f39716k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (j10 & 4294967295L), (int) (j10 >> 32));
            }
        }
        if (z10) {
            pVar.i();
            pVar.c();
        }
        return Unit.f23355a;
    }
}
