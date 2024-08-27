package im;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f20114b = Collections.unmodifiableSet(new HashSet(Arrays.asList("com.firebase.ui.auth.data.client.email", "com.firebase.ui.auth.data.client.provider", "com.firebase.ui.auth.data.client.idpToken", "com.firebase.ui.auth.data.client.idpSecret")));

    /* renamed from: c, reason: collision with root package name */
    public static final b f20115c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public zp.d f20116a;

    public static void a(Application application) {
        Preconditions.checkNotNull(application);
        SharedPreferences.Editor edit = application.getSharedPreferences("com.firebase.ui.auth.util.data.EmailLinkPersistenceManager", 0).edit();
        Iterator it = f20114b.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.apply();
    }
}
