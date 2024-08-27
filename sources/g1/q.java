package g1;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public interface q extends CoroutineContext.Element {
    @Override // kotlin.coroutines.CoroutineContext.Element
    default kotlin.coroutines.i getKey() {
        return a.f16394p;
    }

    float x();
}
