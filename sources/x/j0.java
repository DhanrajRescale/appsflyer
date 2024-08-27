package x;

import android.view.KeyEvent;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f39595a = ViewConfiguration.getTapTimeout();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f39596b = 0;

    public static final boolean a(KeyEvent keyEvent) {
        int a10 = (int) (androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode()) >> 32);
        if (a10 != 23 && a10 != 66 && a10 != 160) {
            return false;
        }
        return true;
    }
}
