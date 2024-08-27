package com.appsflyer;

import com.appsflyer.internal.AFg1aSDK;
import com.appsflyer.internal.AFg1fSDK;
import iu.k;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import ut.g;
import ut.h;
import vt.d0;
import vt.v;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0013\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001;B\t\b\u0002¢\u0006\u0004\b9\u0010:J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ7\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u0017J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0017J#\u0010\u0011\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0011\u0010\u001bJ#\u0010\u001c\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u001c\u0010\u001bJ+\u0010\u001c\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001eJ+\u0010\u0011\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u001eJ3\u0010\u0011\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u001fJ\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0017J!\u0010\"\u001a\u00020\u00062\u0012\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010 \"\u00020\u0001¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u00020\u00062\u0012\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010 \"\u00020\u0001¢\u0006\u0004\b$\u0010#J'\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010)JG\u0010,\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010-J'\u0010.\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b.\u0010)J'\u0010/\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u0010)J'\u00100\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b0\u0010)J\u001f\u00101\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b1\u00102R\u0019\u00106\u001a\b\u0012\u0004\u0012\u00020\u000103X\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b4\u00105R\u0017\u00108\u001a\u0006*\u00020707X\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b6\u00105"}, d2 = {"Lcom/appsflyer/AFLogger;", "Lcom/appsflyer/internal/AFg1fSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "logMessage", HttpUrl.FRAGMENT_ENCODE_SET, "shouldRemoteDebug", HttpUrl.FRAGMENT_ENCODE_SET, "afInfoLog", "(Ljava/lang/String;Z)V", "debugLogMessage", "afDebugLog", "message", HttpUrl.FRAGMENT_ENCODE_SET, "ex", "printMessage", "printThrowable", "shouldReportToExManager", "afErrorLog", "(Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V", "warningLogMessage", "afWarnLog", "rdLogMessage", "afVerboseLog", "(Ljava/lang/String;)V", "afRDLog", "afLogForce", "errorLogMessage", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "afErrorLogForExcManagerOnly", "disableReporting", "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", "(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V", HttpUrl.FRAGMENT_ENCODE_SET, "client", "registerClient", "([Lcom/appsflyer/internal/AFg1fSDK;)V", "unregisterClient", "Lcom/appsflyer/internal/AFg1aSDK;", "tag", "msg", "d", "(Lcom/appsflyer/internal/AFg1aSDK;Ljava/lang/String;Z)V", "throwable", "printMsg", "e", "(Lcom/appsflyer/internal/AFg1aSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "i", "w", "v", "force", "(Lcom/appsflyer/internal/AFg1aSDK;Ljava/lang/String;)V", HttpUrl.FRAGMENT_ENCODE_SET, "valueOf", "Lut/g;", "AFInAppEventType", "Ljava/util/concurrent/ExecutorService;", "AFInAppEventParameterName", "<init>", "()V", "LogLevel"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class AFLogger extends AFg1fSDK {

    @NotNull
    public static final AFLogger INSTANCE = new AFLogger();

    /* renamed from: valueOf, reason: from kotlin metadata */
    @NotNull
    private static final g AFInAppEventType = h.a(AnonymousClass10.values);

    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    @NotNull
    private static final g AFInAppEventParameterName = h.a(AnonymousClass1.AFKeystoreWrapper);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "AFKeystoreWrapper", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends k implements Function0<ExecutorService> {
        public static final AnonymousClass1 AFKeystoreWrapper = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFKeystoreWrapper */
        public final ExecutorService mo2invoke() {
            return Executors.newSingleThreadExecutor();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\u0010\u0003\u001a\u001a\u0012\b\u0012\u0006*\u00020\u00010\u0001*\f\u0012\b\u0012\u0006*\u00020\u00010\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/appsflyer/internal/AFg1fSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "AFKeystoreWrapper", "()Ljava/util/Set;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$10 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass10 extends k implements Function0<Set<AFg1fSDK>> {
        public static final AnonymousClass10 values = new AnonymousClass10();

        public AnonymousClass10() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFKeystoreWrapper */
        public final Set<AFg1fSDK> mo2invoke() {
            return Collections.synchronizedSet(new LinkedHashSet());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1fSDK;", "p0", HttpUrl.FRAGMENT_ENCODE_SET, "AFInAppEventType", "(Lcom/appsflyer/internal/AFg1fSDK;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$2 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends k implements Function1<AFg1fSDK, Unit> {
        private /* synthetic */ boolean $AFInAppEventType;
        private /* synthetic */ String $AFKeystoreWrapper;
        private /* synthetic */ AFg1aSDK $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AFg1aSDK aFg1aSDK, String str, boolean z10) {
            super(1);
            this.$values = aFg1aSDK;
            this.$AFKeystoreWrapper = str;
            this.$AFInAppEventType = z10;
        }

        public final void AFInAppEventType(@NotNull AFg1fSDK aFg1fSDK) {
            Intrinsics.checkNotNullParameter(aFg1fSDK, "");
            aFg1fSDK.i(this.$values, this.$AFKeystoreWrapper, this.$AFInAppEventType);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            AFInAppEventType((AFg1fSDK) obj);
            return Unit.f23355a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1fSDK;", "p0", HttpUrl.FRAGMENT_ENCODE_SET, "valueOf", "(Lcom/appsflyer/internal/AFg1fSDK;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$3 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends k implements Function1<AFg1fSDK, Unit> {
        private /* synthetic */ boolean $AFInAppEventParameterName;
        private /* synthetic */ boolean $AFInAppEventType;
        private /* synthetic */ Throwable $AFKeystoreWrapper;
        private /* synthetic */ boolean $AFLogger;
        private /* synthetic */ boolean $e;
        private /* synthetic */ String $valueOf;
        private /* synthetic */ AFg1aSDK $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AFg1aSDK aFg1aSDK, String str, Throwable th2, boolean z10, boolean z11, boolean z12, boolean z13) {
            super(1);
            this.$values = aFg1aSDK;
            this.$valueOf = str;
            this.$AFKeystoreWrapper = th2;
            this.$AFInAppEventParameterName = z10;
            this.$AFInAppEventType = z11;
            this.$AFLogger = z12;
            this.$e = z13;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            valueOf((AFg1fSDK) obj);
            return Unit.f23355a;
        }

        public final void valueOf(@NotNull AFg1fSDK aFg1fSDK) {
            Intrinsics.checkNotNullParameter(aFg1fSDK, "");
            aFg1fSDK.e(this.$values, this.$valueOf, this.$AFKeystoreWrapper, this.$AFInAppEventParameterName, this.$AFInAppEventType, this.$AFLogger, this.$e);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1fSDK;", "p0", HttpUrl.FRAGMENT_ENCODE_SET, "AFKeystoreWrapper", "(Lcom/appsflyer/internal/AFg1fSDK;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$4 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends k implements Function1<AFg1fSDK, Unit> {
        private /* synthetic */ AFg1aSDK $AFKeystoreWrapper;
        private /* synthetic */ String $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AFg1aSDK aFg1aSDK, String str) {
            super(1);
            this.$AFKeystoreWrapper = aFg1aSDK;
            this.$values = str;
        }

        public final void AFKeystoreWrapper(@NotNull AFg1fSDK aFg1fSDK) {
            Intrinsics.checkNotNullParameter(aFg1fSDK, "");
            aFg1fSDK.force(this.$AFKeystoreWrapper, this.$values);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            AFKeystoreWrapper((AFg1fSDK) obj);
            return Unit.f23355a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1fSDK;", "p0", HttpUrl.FRAGMENT_ENCODE_SET, "valueOf", "(Lcom/appsflyer/internal/AFg1fSDK;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$5 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends k implements Function1<AFg1fSDK, Unit> {
        private /* synthetic */ boolean $AFInAppEventParameterName;
        private /* synthetic */ AFg1aSDK $AFKeystoreWrapper;
        private /* synthetic */ String $valueOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(AFg1aSDK aFg1aSDK, String str, boolean z10) {
            super(1);
            this.$AFKeystoreWrapper = aFg1aSDK;
            this.$valueOf = str;
            this.$AFInAppEventParameterName = z10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            valueOf((AFg1fSDK) obj);
            return Unit.f23355a;
        }

        public final void valueOf(@NotNull AFg1fSDK aFg1fSDK) {
            Intrinsics.checkNotNullParameter(aFg1fSDK, "");
            aFg1fSDK.d(this.$AFKeystoreWrapper, this.$valueOf, this.$AFInAppEventParameterName);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1fSDK;", "p0", HttpUrl.FRAGMENT_ENCODE_SET, "valueOf", "(Lcom/appsflyer/internal/AFg1fSDK;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$7 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends k implements Function1<AFg1fSDK, Unit> {
        private /* synthetic */ AFg1aSDK $AFInAppEventParameterName;
        private /* synthetic */ String $AFInAppEventType;
        private /* synthetic */ boolean $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(AFg1aSDK aFg1aSDK, String str, boolean z10) {
            super(1);
            this.$AFInAppEventParameterName = aFg1aSDK;
            this.$AFInAppEventType = str;
            this.$values = z10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            valueOf((AFg1fSDK) obj);
            return Unit.f23355a;
        }

        public final void valueOf(@NotNull AFg1fSDK aFg1fSDK) {
            Intrinsics.checkNotNullParameter(aFg1fSDK, "");
            aFg1fSDK.v(this.$AFInAppEventParameterName, this.$AFInAppEventType, this.$values);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFg1fSDK;", "p0", HttpUrl.FRAGMENT_ENCODE_SET, "AFInAppEventParameterName", "(Lcom/appsflyer/internal/AFg1fSDK;)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$9 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass9 extends k implements Function1<AFg1fSDK, Unit> {
        private /* synthetic */ boolean $AFInAppEventParameterName;
        private /* synthetic */ String $AFKeystoreWrapper;
        private /* synthetic */ AFg1aSDK $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(AFg1aSDK aFg1aSDK, String str, boolean z10) {
            super(1);
            this.$values = aFg1aSDK;
            this.$AFKeystoreWrapper = str;
            this.$AFInAppEventParameterName = z10;
        }

        public final void AFInAppEventParameterName(@NotNull AFg1fSDK aFg1fSDK) {
            Intrinsics.checkNotNullParameter(aFg1fSDK, "");
            aFg1fSDK.w(this.$values, this.$AFKeystoreWrapper, this.$AFInAppEventParameterName);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            AFInAppEventParameterName((AFg1fSDK) obj);
            return Unit.f23355a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/appsflyer/AFLogger$LogLevel;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "values", "I", "getLevel", "()I", "level", "p0", "<init>", "(Ljava/lang/String;II)V", "NONE", "ERROR", "WARNING", "INFO", "DEBUG", "VERBOSE"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);


        /* renamed from: values, reason: from kotlin metadata */
        private final int level;

        LogLevel(int i10) {
            this.level = i10;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    private AFLogger() {
    }

    public static final void AFInAppEventType(AFg1fSDK[] aFg1fSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1fSDKArr, "");
        g gVar = AFInAppEventType;
        Object value = gVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = gVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            d0.n((Set) value2, aFg1fSDKArr);
            Unit unit = Unit.f23355a;
        }
    }

    @ut.a
    public static final void afDebugLog(@NotNull String debugLogMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(debugLogMessage, "");
        INSTANCE.d(AFg1aSDK.OTHER, debugLogMessage, shouldRemoteDebug);
    }

    @ut.a
    public static final void afErrorLog(@NotNull String message, @NotNull Throwable ex, boolean printMessage, boolean printThrowable, boolean shouldReportToExManager) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(ex, "");
        AFg1fSDK.e$default(INSTANCE, AFg1aSDK.OTHER, message, ex, printMessage, printThrowable, shouldReportToExManager, false, 64, null);
    }

    @ut.a
    public static final void afErrorLogForExcManagerOnly(String errorLogMessage, Throwable ex) {
        AFLogger aFLogger = INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.OTHER;
        if (errorLogMessage == null || w.C(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1fSDK.e$default(aFLogger, aFg1aSDK, str, ex, false, false, true, false, 64, null);
    }

    @ut.a
    public static final void afInfoLog(@NotNull String logMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.i(AFg1aSDK.OTHER, logMessage, shouldRemoteDebug);
    }

    @ut.a
    public static final void afLogForce(@NotNull String logMessage) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.force(AFg1aSDK.OTHER, logMessage);
    }

    @ut.a
    public static final void afRDLog(@NotNull String rdLogMessage) {
        Intrinsics.checkNotNullParameter(rdLogMessage, "");
        INSTANCE.v(AFg1aSDK.OTHER, rdLogMessage, true);
    }

    @ut.a
    public static final void afVerboseLog(@NotNull String rdLogMessage) {
        Intrinsics.checkNotNullParameter(rdLogMessage, "");
        INSTANCE.v(AFg1aSDK.OTHER, rdLogMessage, false);
    }

    @ut.a
    public static final void afWarnLog(@NotNull String warningLogMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(warningLogMessage, "");
        INSTANCE.w(AFg1aSDK.OTHER, warningLogMessage, shouldRemoteDebug);
    }

    public static final void valueOf(AFg1fSDK[] aFg1fSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1fSDKArr, "");
        g gVar = AFInAppEventType;
        Object value = gVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = gVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            ((Set) value2).removeAll(v.B(aFg1fSDKArr));
            Unit unit = Unit.f23355a;
        }
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void d(@NotNull AFg1aSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new a(5, new AnonymousClass5(tag, msg, shouldRemoteDebug)));
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void e(@NotNull AFg1aSDK tag, @NotNull String msg, @NotNull Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        Intrinsics.checkNotNullParameter(throwable, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new a(1, new AnonymousClass3(tag, msg, throwable, printMsg, printThrowable, shouldReportToExManager, shouldRemoteDebug)));
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void force(@NotNull AFg1aSDK tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new a(3, new AnonymousClass4(tag, msg)));
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void i(@NotNull AFg1aSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new a(4, new AnonymousClass2(tag, msg, shouldRemoteDebug)));
    }

    public final void registerClient(@NotNull AFg1fSDK... client) {
        Intrinsics.checkNotNullParameter(client, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new b(client, 1));
    }

    public final void unregisterClient(@NotNull AFg1fSDK... client) {
        Intrinsics.checkNotNullParameter(client, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new b(client, 0));
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void v(@NotNull AFg1aSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new a(0, new AnonymousClass7(tag, msg, shouldRemoteDebug)));
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void w(@NotNull AFg1aSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) AFInAppEventParameterName.getValue()).execute(new a(2, new AnonymousClass9(tag, msg, shouldRemoteDebug)));
    }

    @ut.a
    public static final void afDebugLog(@NotNull String debugLogMessage) {
        Intrinsics.checkNotNullParameter(debugLogMessage, "");
        INSTANCE.d(AFg1aSDK.OTHER, debugLogMessage, true);
    }

    @ut.a
    public static final void afInfoLog(@NotNull String logMessage) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.i(AFg1aSDK.OTHER, logMessage, true);
    }

    @ut.a
    public static final void afWarnLog(@NotNull String warningLogMessage) {
        Intrinsics.checkNotNullParameter(warningLogMessage, "");
        AFg1fSDK.w$default(INSTANCE, AFg1aSDK.OTHER, warningLogMessage, false, 4, null);
    }

    @ut.a
    public static final void afErrorLog(String errorLogMessage, Throwable ex) {
        AFLogger aFLogger = INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.OTHER;
        if (errorLogMessage == null || w.C(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1fSDK.e$default(aFLogger, aFg1aSDK, str, ex, false, false, false, false, 120, null);
    }

    @ut.a
    public static final void afErrorLogForExcManagerOnly(String errorLogMessage, Throwable ex, boolean disableReporting) {
        AFLogger aFLogger = INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.OTHER;
        if (errorLogMessage == null || w.C(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1fSDK.e$default(aFLogger, aFg1aSDK, str, ex, false, false, !disableReporting, false, 64, null);
    }

    public static final void AFInAppEventType(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        g gVar = AFInAppEventType;
        Object value = gVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            try {
                Object value2 = gVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "");
                Iterator it = ((Set) value2).iterator();
                while (it.hasNext()) {
                    function1.invoke((AFg1fSDK) it.next());
                }
                Unit unit = Unit.f23355a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @ut.a
    public static final void afErrorLog(String errorLogMessage, Throwable ex, boolean printThrowable) {
        AFLogger aFLogger = INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.OTHER;
        if (errorLogMessage == null || w.C(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1fSDK.e$default(aFLogger, aFg1aSDK, str, ex, false, printThrowable, false, false, 104, null);
    }

    @ut.a
    public static final void afErrorLog(String errorLogMessage, Throwable ex, boolean printThrowable, boolean shouldReportToExManager) {
        AFLogger aFLogger = INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.OTHER;
        if (errorLogMessage == null || w.C(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1fSDK.e$default(aFLogger, aFg1aSDK, str, ex, false, printThrowable, shouldReportToExManager, false, 72, null);
    }
}
