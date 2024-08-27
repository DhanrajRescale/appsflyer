package y3;

import android.os.Bundle;
import android.os.IBinder;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class c {
    public static final void a(@NotNull Bundle bundle, @NotNull String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
