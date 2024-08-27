package e8;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.u;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f15091b = u.C("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f15092a;

    public a(Context context) {
        this.f15092a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
