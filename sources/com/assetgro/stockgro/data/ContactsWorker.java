package com.assetgro.stockgro.data;

import android.content.Context;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import androidx.work.k;
import androidx.work.q;
import androidx.work.t;
import at.m;
import at.o;
import com.assetgro.stockgro.data.repository.ContactsRepository;
import ek.u;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nt.d;
import nt.f;
import nt.i;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/assetgro/stockgro/data/ContactsWorker;", "Landroidx/work/RxWorker;", HttpUrl.FRAGMENT_ENCODE_SET, "hasPermission", "Lat/m;", "Landroidx/work/t;", "createWork", "Lcom/assetgro/stockgro/data/repository/ContactsRepository;", "contactsRepository", "Lcom/assetgro/stockgro/data/repository/ContactsRepository;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/assetgro/stockgro/data/repository/ContactsRepository;)V", "Companion", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ContactsWorker extends RxWorker {
    public static final long repeatDurationDays = 1;

    @NotNull
    private final ContactsRepository contactsRepository;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParams, @NotNull ContactsRepository contactsRepository) {
        super(appContext, workerParams);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        this.contactsRepository = contactsRepository;
    }

    public static final List createWork$lambda$0(ContactsWorker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.hasPermission()) {
            return this$0.contactsRepository.retrieveAllContacts();
        }
        qv.a.f32312b.getClass();
        u.l(new Object[0]);
        throw new IllegalStateException("Contacts permission not available");
    }

    public static final o createWork$lambda$1(Function1 function1, Object obj) {
        return (o) a3.a.c(function1, "$tmp0", obj, "p0", obj);
    }

    public static final t createWork$lambda$2(Function1 function1, Object obj) {
        return (t) a3.a.c(function1, "$tmp0", obj, "p0", obj);
    }

    public static final t createWork$lambda$3(Throwable ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        HashMap hashMap = new HashMap();
        hashMap.put("message", ex.getLocalizedMessage());
        k kVar = new k(hashMap);
        k.c(kVar);
        Intrinsics.checkNotNullExpressionValue(kVar, "build(...)");
        return new q(kVar);
    }

    private final boolean hasPermission() {
        if (r3.k.checkSelfPermission(getApplicationContext(), "android.permission.READ_CONTACTS") == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.RxWorker
    @NotNull
    public m<t> createWork() {
        i iVar = new i(new f(new f(new d(new j9.m(this, 1), 1), new a(2, new ContactsWorker$createWork$2(this)), 0), new a(3, ContactsWorker$createWork$3.INSTANCE), 1), new j5.d(9));
        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorReturn(...)");
        return iVar;
    }
}
