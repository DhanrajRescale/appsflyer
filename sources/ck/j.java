package ck;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class j implements sk.b {

    /* renamed from: a, reason: collision with root package name */
    public final MessageDigest f8204a;

    /* renamed from: b, reason: collision with root package name */
    public final sk.e f8205b = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, sk.e] */
    public j(MessageDigest messageDigest) {
        this.f8204a = messageDigest;
    }

    @Override // sk.b
    public final sk.e e() {
        return this.f8205b;
    }
}
