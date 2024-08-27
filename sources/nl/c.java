package nl;

import com.facebook.FacebookSdk;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    public static final String f28837f = c.class.getCanonicalName();

    /* renamed from: g, reason: collision with root package name */
    public static c f28838g;

    /* renamed from: a, reason: collision with root package name */
    public String f28839a;

    /* renamed from: b, reason: collision with root package name */
    public long f28840b;

    /* renamed from: c, reason: collision with root package name */
    public String f28841c;

    /* renamed from: d, reason: collision with root package name */
    public String f28842d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28843e;

    public final String a() {
        if (FacebookSdk.isInitialized() && FacebookSdk.getAdvertiserIDCollectionEnabled()) {
            return this.f28839a;
        }
        return null;
    }
}
