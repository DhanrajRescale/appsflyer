package uu;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import qu.o1;

/* loaded from: classes2.dex */
public final class z extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f37474a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(w wVar) {
        super(2);
        this.f37474a = wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        int intValue = ((Number) obj).intValue();
        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
        kotlin.coroutines.i key = element.getKey();
        CoroutineContext.Element g10 = this.f37474a.f37468b.g(key);
        if (key != qu.c0.f32192b) {
            if (element != g10) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = intValue + 1;
            }
            return Integer.valueOf(i10);
        }
        o1 o1Var = (o1) g10;
        o1 o1Var2 = (o1) element;
        while (true) {
            if (o1Var2 == null) {
                o1Var2 = null;
                break;
            }
            if (o1Var2 == o1Var || !(o1Var2 instanceof vu.y)) {
                break;
            }
            o1Var2 = o1Var2.getParent();
        }
        if (o1Var2 == o1Var) {
            if (o1Var != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + o1Var2 + ", expected child of " + o1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
