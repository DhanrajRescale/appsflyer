package kd;

import iu.k;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f23067b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f23068c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, List list, Function2 function2) {
        super(1);
        this.f23066a = i10;
        this.f23067b = function2;
        this.f23068c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list = this.f23068c;
        Function2 function2 = this.f23067b;
        int i10 = this.f23066a;
        switch (i10) {
            case 0:
                int intValue = ((Number) obj).intValue();
                switch (i10) {
                    case 0:
                        return function2.invoke(Integer.valueOf(intValue), list.get(intValue));
                    default:
                        return function2.invoke(Integer.valueOf(intValue), list.get(intValue));
                }
            default:
                int intValue2 = ((Number) obj).intValue();
                switch (i10) {
                    case 0:
                        return function2.invoke(Integer.valueOf(intValue2), list.get(intValue2));
                    default:
                        return function2.invoke(Integer.valueOf(intValue2), list.get(intValue2));
                }
        }
    }
}
