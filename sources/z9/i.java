package z9;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class i {
    public final String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this instanceof h) {
            h hVar = (h) this;
            String string = context.getString(hVar.f42204a, hVar.f42205b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (this instanceof g) {
            return ((g) this).f42203a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
