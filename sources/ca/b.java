package ca;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.m0;
import com.assetgro.stockgro.data.ContactsUploadForegroundWorker;
import com.assetgro.stockgro.data.ContactsWorker;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.ContactsRepository;
import com.assetgro.stockgro.data.repository.ContactsRepository_Factory;
import com.assetgro.stockgro.ui.chat.helper.search.AssetUploadWorker;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends m0 {

    /* renamed from: b, reason: collision with root package name */
    public final Provider f8071b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f8072c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider f8073d;

    public b(ContactsRepository_Factory contactsRepositoryProvider, xs.b chatRepositoryProvider, xs.b feedRepositoryProvider) {
        Intrinsics.checkNotNullParameter(contactsRepositoryProvider, "contactsRepositoryProvider");
        Intrinsics.checkNotNullParameter(chatRepositoryProvider, "chatRepositoryProvider");
        Intrinsics.checkNotNullParameter(feedRepositoryProvider, "feedRepositoryProvider");
        this.f8071b = contactsRepositoryProvider;
        this.f8072c = chatRepositoryProvider;
    }

    @Override // androidx.work.m0
    public final ListenableWorker a(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        boolean a10 = Intrinsics.a(workerClassName, ContactsWorker.class.getName());
        Provider provider = this.f8071b;
        if (a10) {
            Object obj = provider.get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            return new ContactsWorker(appContext, workerParameters, (ContactsRepository) obj);
        }
        if (Intrinsics.a(workerClassName, ContactsUploadForegroundWorker.class.getName())) {
            Object obj2 = provider.get();
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            return new ContactsUploadForegroundWorker(appContext, workerParameters, (ContactsRepository) obj2);
        }
        if (Intrinsics.a(workerClassName, AssetUploadWorker.class.getName())) {
            Object obj3 = this.f8072c.get();
            Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
            return new AssetUploadWorker(appContext, workerParameters, (ChatRepository) obj3);
        }
        return null;
    }
}
