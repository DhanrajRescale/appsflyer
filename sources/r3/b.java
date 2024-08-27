package r3;

import android.content.Context;
import android.content.res.Configuration;

/* loaded from: classes.dex */
public abstract class b {
    public static Context a(Context context, Configuration configuration) {
        return context.createConfigurationContext(configuration);
    }
}
