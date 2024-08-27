package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import iu.a0;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import ut.l;
import vt.v;

/* loaded from: classes.dex */
public final class AFj1ySDK {

    @NotNull
    final Intent AFInAppEventParameterName;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Parcelable;", "T", "valueOf", "()Landroid/os/Parcelable;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFj1ySDK$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends iu.k implements Function0 {
        private /* synthetic */ String $valueOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$valueOf = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
        public final Parcelable mo2invoke() {
            return AFj1ySDK.this.AFInAppEventParameterName.getParcelableExtra(this.$valueOf);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "values", "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFj1ySDK$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends iu.k implements Function0<String> {
        private /* synthetic */ String $valueOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(0);
            this.$valueOf = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: values, reason: merged with bridge method [inline-methods] */
        public final String mo2invoke() {
            return AFj1ySDK.this.AFInAppEventParameterName.getStringExtra(this.$valueOf);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "valueOf", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFj1ySDK$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends iu.k implements Function0<Boolean> {
        private /* synthetic */ String $AFInAppEventParameterName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str) {
            super(0);
            this.$AFInAppEventParameterName = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
        public final Boolean mo2invoke() {
            return Boolean.valueOf(AFj1ySDK.this.AFInAppEventParameterName.hasExtra(this.$AFInAppEventParameterName));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/Intent;", "values", "()Landroid/content/Intent;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFj1ySDK$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends iu.k implements Function0<Intent> {
        private /* synthetic */ long $AFKeystoreWrapper;
        private /* synthetic */ String $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, long j10) {
            super(0);
            this.$values = str;
            this.$AFKeystoreWrapper = j10;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: values, reason: merged with bridge method [inline-methods] */
        public final Intent mo2invoke() {
            return AFj1ySDK.this.AFInAppEventParameterName.putExtra(this.$values, this.$AFKeystoreWrapper);
        }
    }

    public AFj1ySDK(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.AFInAppEventParameterName = intent;
    }

    public final String AFInAppEventParameterName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(str);
        StringBuilder sb2 = new StringBuilder("Error while trying to read ");
        sb2.append(str);
        sb2.append(" extra from intent");
        return (String) AFInAppEventParameterName(anonymousClass2, sb2.toString(), null, true);
    }

    public final boolean values(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(str);
        StringBuilder sb2 = new StringBuilder("Error while trying to check presence of ");
        sb2.append(str);
        sb2.append(" extra from intent");
        Boolean bool = (Boolean) AFInAppEventParameterName(anonymousClass3, sb2.toString(), Boolean.TRUE, true);
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final Intent AFInAppEventParameterName(@NotNull String str, long j10) {
        Intrinsics.checkNotNullParameter(str, "");
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(str, j10);
        StringBuilder sb2 = new StringBuilder("Error while trying to write ");
        sb2.append(str);
        sb2.append(" extra to intent");
        return (Intent) AFInAppEventParameterName(anonymousClass5, sb2.toString(), null, true);
    }

    public final <T> T AFInAppEventParameterName(Function0<? extends T> function0, String str, T t10, boolean z10) {
        T a10;
        Object a11;
        synchronized (this.AFInAppEventParameterName) {
            try {
                l.Companion companion = ut.l.INSTANCE;
                a10 = function0.mo2invoke();
            } catch (Throwable th2) {
                l.Companion companion2 = ut.l.INSTANCE;
                a10 = ut.n.a(th2);
            }
            ou.b[] bVarArr = {a0.a(ConcurrentModificationException.class), a0.a(ArrayIndexOutOfBoundsException.class)};
            Throwable a12 = ut.l.a(a10);
            if (a12 != null) {
                try {
                } catch (Throwable th3) {
                    l.Companion companion3 = ut.l.INSTANCE;
                    a11 = ut.n.a(th3);
                }
                if (!v.o(bVarArr, a0.a(a12.getClass()))) {
                    throw a12;
                }
                if (z10) {
                    a11 = AFInAppEventParameterName(function0, str, t10, false);
                } else {
                    AFLogger.afErrorLog(str, a12, false, false);
                    a11 = t10;
                }
                a10 = a11;
            }
            ou.b[] bVarArr2 = {a0.a(RuntimeException.class)};
            Throwable a13 = ut.l.a(a10);
            if (a13 != null) {
                try {
                } catch (Throwable th4) {
                    l.Companion companion4 = ut.l.INSTANCE;
                    t10 = (T) ut.n.a(th4);
                }
                if (v.o(bVarArr2, a0.a(a13.getClass()))) {
                    AFLogger.afErrorLog(str, a13, false, false);
                    a10 = t10;
                } else {
                    throw a13;
                }
            }
            ut.n.b(a10);
        }
        return (T) a10;
    }
}
