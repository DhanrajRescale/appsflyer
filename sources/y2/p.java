package y2;

import android.os.Parcelable;
import android.util.SparseArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class p extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f41133b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i10) {
        super(0);
        this.f41132a = i10;
        this.f41133b = qVar;
    }

    public final void a() {
        int i10 = this.f41132a;
        q qVar = this.f41133b;
        switch (i10) {
            case 1:
                qVar.getReleaseBlock().invoke(qVar.f41134x);
                q.l(qVar);
                return;
            case 2:
                qVar.getResetBlock().invoke(qVar.f41134x);
                return;
            default:
                qVar.getUpdateBlock().invoke(qVar.f41134x);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        switch (this.f41132a) {
            case 0:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f41133b.f41134x.saveHierarchyState(sparseArray);
                return sparseArray;
            case 1:
                a();
                return Unit.f23355a;
            case 2:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
