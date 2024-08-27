package zl;

import android.content.Context;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.google.android.gms.internal.p002firebaseauthapi.zzaav;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Set;
import pp.g;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final Set f42557c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f42558d;

    /* renamed from: e, reason: collision with root package name */
    public static final IdentityHashMap f42559e;

    /* renamed from: f, reason: collision with root package name */
    public static Context f42560f;

    /* renamed from: a, reason: collision with root package name */
    public final g f42561a;

    /* renamed from: b, reason: collision with root package name */
    public final FirebaseAuth f42562b;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList("google.com", FacebookSdk.FACEBOOK_COM, "twitter.com", "github.com", "password", "phone", "anonymous", "emailLink")));
        f42557c = Collections.unmodifiableSet(new HashSet(Arrays.asList("microsoft.com", "yahoo.com", "apple.com", "twitter.com", "github.com")));
        f42558d = Collections.unmodifiableSet(new HashSet(Arrays.asList("google.com", FacebookSdk.FACEBOOK_COM)));
        f42559e = new IdentityHashMap();
    }

    public c(g gVar) {
        this.f42561a = gVar;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(gVar);
        this.f42562b = firebaseAuth;
        try {
            firebaseAuth.f11631e.zzz("8.0.0");
        } catch (Exception e10) {
            Log.e("AuthUI", "Couldn't set the FUI version.", e10);
        }
        FirebaseAuth firebaseAuth2 = this.f42562b;
        synchronized (firebaseAuth2.f11634h) {
            firebaseAuth2.f11635i = zzaav.zza();
        }
    }

    public static c a(String str) {
        c cVar;
        g e10 = g.e(str);
        if (im.d.f20123b) {
            Log.w("AuthUI", String.format("Beginning with FirebaseUI 6.2.0 you no longer need to include %s to sign in with %s. Go to %s for more information", "the TwitterKit SDK", "Twitter", "https://github.com/firebase/FirebaseUI-Android/releases/tag/6.2.0"));
        }
        if (im.d.f20122a) {
            Log.w("AuthUI", String.format("Beginning with FirebaseUI 6.2.0 you no longer need to include %s to sign in with %s. Go to %s for more information", "com.firebaseui:firebase-ui-auth-github", "GitHub", "https://github.com/firebase/FirebaseUI-Android/releases/tag/6.2.0"));
        }
        IdentityHashMap identityHashMap = f42559e;
        synchronized (identityHashMap) {
            try {
                cVar = (c) identityHashMap.get(e10);
                if (cVar == null) {
                    cVar = new c(e10);
                    identityHashMap.put(e10, cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }
}
