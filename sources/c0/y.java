package c0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class y extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final y f7618b = new y(0);

    /* renamed from: c, reason: collision with root package name */
    public static final y f7619c = new y(1);

    /* renamed from: d, reason: collision with root package name */
    public static final y f7620d = new y(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7621a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i10) {
        super(1);
        this.f7621a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7621a) {
            case 0:
                return Unit.f23355a;
            case 1:
                ((Number) obj).intValue();
                return null;
            default:
                List list = (List) obj;
                return new m0(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }
}
