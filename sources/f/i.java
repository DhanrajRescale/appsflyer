package f;

import android.content.Intent;
import androidx.activity.m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends a {
    @Override // f.a
    public final Intent a(m context, Object obj) {
        Intent input = (Intent) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return input;
    }

    @Override // f.a
    public final Object c(int i10, Intent intent) {
        return new e.a(i10, intent);
    }
}
