package com.assetgro.stockgro.data;

import at.e;
import javax.inject.Inject;
import javax.inject.Singleton;
import kj.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import tt.b;

@Singleton
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002R.\u0010\u0007\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0006*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00050\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/assetgro/stockgro/data/MultipleSignInLogoutSubject;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "signalLogout", "Ltt/b;", "Lkj/j;", "kotlin.jvm.PlatformType", "_logout", "Ltt/b;", "Lat/e;", "getLogout", "()Lat/e;", "logout", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MultipleSignInLogoutSubject {
    public static final int $stable = 8;

    @NotNull
    private final b _logout;

    @Inject
    public MultipleSignInLogoutSubject() {
        b bVar = new b();
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        this._logout = bVar;
    }

    @NotNull
    public final e getLogout() {
        return this._logout;
    }

    public final void signalLogout() {
        this._logout.b(new j(Unit.f23355a));
    }
}
