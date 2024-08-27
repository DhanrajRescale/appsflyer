package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f11799d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f11800a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11801b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11802c;

    public x(String str, String str2) {
        String str3;
        if (str2 != null && str2.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str));
            str3 = str2.substring(8);
        } else {
            str3 = str2;
        }
        if (str3 != null && f11799d.matcher(str3).matches()) {
            this.f11800a = str3;
            this.f11801b = str;
            this.f11802c = a3.a.g(str, "!", str2);
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str3, "[a-zA-Z0-9-_.~%]{1,900}"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!this.f11800a.equals(xVar.f11800a) || !this.f11801b.equals(xVar.f11801b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f11801b, this.f11800a);
    }
}
