package v1;

import android.view.KeyEvent;
import g1.n;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d extends n implements c {

    /* renamed from: n, reason: collision with root package name */
    public Function1 f37672n;

    /* renamed from: o, reason: collision with root package name */
    public Function1 f37673o;

    @Override // v1.c
    public final boolean g(KeyEvent keyEvent) {
        Function1 function1 = this.f37673o;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // v1.c
    public final boolean z(KeyEvent keyEvent) {
        Function1 function1 = this.f37672n;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }
}
