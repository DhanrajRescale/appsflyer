package im;

import com.facebook.login.LoginManager;
import ll.f;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f20122a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f20123b;

    static {
        boolean z10;
        boolean z11 = false;
        try {
            Class.forName("com.firebase.ui.auth.data.remote.GitHubSignInHandler");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f20122a = z10;
        try {
            f fVar = LoginManager.f10882f;
        } catch (ClassNotFoundException unused2) {
        }
        try {
            Class.forName("com.twitter.sdk.android.core.identity.TwitterAuthClient");
            z11 = true;
        } catch (ClassNotFoundException unused3) {
        }
        f20123b = z11;
    }
}
