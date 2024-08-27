package com.assetgro.stockgro.data;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.m;
import b4.f;
import com.assetgro.stockgro.data.repository.ContactsRepository;
import com.assetgro.stockgro.prod.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import q3.d0;
import q3.u0;
import q3.v0;
import r3.k;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\u0004H\u0097@¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/assetgro/stockgro/data/ContactsUploadForegroundWorker;", "Landroidx/work/CoroutineWorker;", "Landroidx/work/m;", "createForegroundInfo", "Landroidx/work/t;", "doWork", "(Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/repository/ContactsRepository;", "contactsRepository", "Lcom/assetgro/stockgro/data/repository/ContactsRepository;", "Lq3/v0;", "notificationManager", "Lq3/v0;", HttpUrl.FRAGMENT_ENCODE_SET, "getHasContactsPermission", "()Z", "hasContactsPermission", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/assetgro/stockgro/data/repository/ContactsRepository;)V", "Companion", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ContactsUploadForegroundWorker extends CoroutineWorker {
    private static final int NotificationId = 1030;

    @NotNull
    private final ContactsRepository contactsRepository;

    @NotNull
    private final v0 notificationManager;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsUploadForegroundWorker(@NotNull Context appContext, @NotNull WorkerParameters params, @NotNull ContactsRepository contactsRepository) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        this.contactsRepository = contactsRepository;
        v0 v0Var = new v0(appContext);
        Intrinsics.checkNotNullExpressionValue(v0Var, "from(...)");
        this.notificationManager = v0Var;
    }

    private final m createForegroundInfo() {
        String string = getApplicationContext().getString(R.string.contact_upload_channel_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getApplicationContext().getString(R.string.text_syncing_contacts);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 26) {
            f.n();
            NotificationChannel f10 = f.f(string);
            v0 v0Var = this.notificationManager;
            if (i10 >= 26) {
                u0.a(v0Var.f31651a, f10);
            } else {
                v0Var.getClass();
            }
        }
        d0 d0Var = new d0(getApplicationContext(), string);
        d0Var.f31590e = d0.b(string2);
        d0Var.f31609x.tickerText = d0.b(string2);
        d0Var.f31591f = d0.b("Syncing");
        d0Var.f31609x.icon = R.drawable.ic_baseline_account_circle_24;
        d0Var.f31598m = 100;
        d0Var.f31599n = 0;
        d0Var.f31600o = true;
        d0Var.c(2, true);
        Notification a10 = d0Var.a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        return new m(NotificationId, 0, a10);
    }

    public static final void doWork$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void doWork$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final boolean getHasContactsPermission() {
        if (k.checkSelfPermission(getApplicationContext(), "android.permission.READ_CONTACTS") == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.work.CoroutineWorker
    @android.annotation.SuppressLint({"CheckResult"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull yt.a<? super androidx.work.t> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.assetgro.stockgro.data.ContactsUploadForegroundWorker$doWork$1
            if (r0 == 0) goto L13
            r0 = r6
            com.assetgro.stockgro.data.ContactsUploadForegroundWorker$doWork$1 r0 = (com.assetgro.stockgro.data.ContactsUploadForegroundWorker$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.assetgro.stockgro.data.ContactsUploadForegroundWorker$doWork$1 r0 = new com.assetgro.stockgro.data.ContactsUploadForegroundWorker$doWork$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            zt.a r1 = zt.a.f42823a
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r1 = r0.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.L$0
            com.assetgro.stockgro.data.ContactsUploadForegroundWorker r0 = (com.assetgro.stockgro.data.ContactsUploadForegroundWorker) r0
            ut.n.b(r6)
            goto L8b
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            ut.n.b(r6)
            boolean r6 = r5.getHasContactsPermission()
            if (r6 != 0) goto L72
            kotlin.Pair r6 = new kotlin.Pair
            java.lang.String r0 = "message"
            java.lang.String r1 = "No contacts permission"
            r6.<init>(r0, r1)
            kotlin.Pair[] r6 = new kotlin.Pair[]{r6}
            androidx.work.j r0 = new androidx.work.j
            r0.<init>(r3)
            r6 = r6[r3]
            java.lang.Object r1 = r6.f23353a
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r6 = r6.f23354b
            r0.b(r6, r1)
            androidx.work.k r6 = r0.a()
            java.lang.String r0 = "dataBuilder.build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            androidx.work.q r0 = new androidx.work.q
            r0.<init>(r6)
            java.lang.String r6 = "failure(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
            return r0
        L72:
            com.assetgro.stockgro.data.repository.ContactsRepository r6 = r5.contactsRepository
            java.util.List r6 = r6.retrieveAllContacts()
            androidx.work.m r2 = r5.createForegroundInfo()
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r0 = r5.setForeground(r2, r0)
            if (r0 != r1) goto L89
            return r1
        L89:
            r0 = r5
            r1 = r6
        L8b:
            iu.z r6 = new iu.z
            r6.<init>()
            com.assetgro.stockgro.data.repository.ContactsRepository r0 = r0.contactsRepository
            at.m r0 = r0.uploadContacts(r1)
            com.assetgro.stockgro.data.ContactsUploadForegroundWorker$doWork$2 r1 = new com.assetgro.stockgro.data.ContactsUploadForegroundWorker$doWork$2
            r1.<init>(r6)
            com.assetgro.stockgro.data.a r2 = new com.assetgro.stockgro.data.a
            r2.<init>(r3, r1)
            com.assetgro.stockgro.data.ContactsUploadForegroundWorker$doWork$3 r1 = new com.assetgro.stockgro.data.ContactsUploadForegroundWorker$doWork$3
            r1.<init>(r6)
            com.assetgro.stockgro.data.a r3 = new com.assetgro.stockgro.data.a
            r3.<init>(r4, r1)
            r0.getClass()
            jt.d r1 = new jt.d
            r1.<init>(r2, r3)
            r0.a(r1)
            java.lang.Object r6 = r6.f20560a
            kotlin.jvm.internal.Intrinsics.c(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.assetgro.stockgro.data.ContactsUploadForegroundWorker.doWork(yt.a):java.lang.Object");
    }
}
