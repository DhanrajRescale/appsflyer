package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import g1.o;
import kotlin.jvm.functions.Function1;
import x.z;

/* loaded from: classes.dex */
public abstract class a {
    public static final long a(int i10) {
        long j10 = (i10 << 32) | (0 & 4294967295L);
        int i11 = v1.a.f37669n;
        return j10;
    }

    public static final int b(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                return 1;
            }
            return 0;
        }
        return 2;
    }

    public static final o c(Function1 function1) {
        return new KeyInputElement(function1, null);
    }

    public static final o d(o oVar, z zVar) {
        return oVar.g(new KeyInputElement(null, zVar));
    }
}
