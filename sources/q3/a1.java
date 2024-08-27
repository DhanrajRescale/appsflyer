package q3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class a1 {
    public static PendingIntent a(Context context, int i10, Intent[] intentArr, int i11, Bundle bundle) {
        return PendingIntent.getActivities(context, i10, intentArr, i11, bundle);
    }
}
