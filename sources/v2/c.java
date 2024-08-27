package v2;

import iu.k;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.n;
import t0.r;
import yk.o;

/* loaded from: classes.dex */
public final class c extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f37676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f37677b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object[] f37678c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2, Object[] objArr) {
        super(2);
        this.f37676a = str;
        this.f37677b = str2;
        this.f37678c = objArr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            r rVar = (r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        Object[] objArr = this.f37678c;
        o.Q(this.f37676a, this.f37677b, nVar, Arrays.copyOf(objArr, objArr.length));
        return Unit.f23355a;
    }
}
