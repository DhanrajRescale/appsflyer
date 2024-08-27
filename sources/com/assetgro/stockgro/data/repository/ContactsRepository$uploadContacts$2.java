package com.assetgro.stockgro.data.repository;

import at.o;
import com.assetgro.stockgro.data.model.ContactUpload;
import com.assetgro.stockgro.data.model.UploadContactItem;
import com.assetgro.stockgro.data.remote.NetworkService;
import iu.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\t\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/UploadContactItem;", "request", "Lat/o;", "Lcom/assetgro/stockgro/data/remote/response/BaseResponseDto;", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin.jvm.PlatformType", "invoke", "(Ljava/util/List;)Lat/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ContactsRepository$uploadContacts$2 extends k implements Function1<List<? extends UploadContactItem>, o> {
    final /* synthetic */ ContactsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsRepository$uploadContacts$2(ContactsRepository contactsRepository) {
        super(1);
        this.this$0 = contactsRepository;
    }

    @Override // kotlin.jvm.functions.Function1
    public final o invoke(@NotNull List<UploadContactItem> request) {
        NetworkService networkService;
        Intrinsics.checkNotNullParameter(request, "request");
        networkService = this.this$0.networkService;
        return networkService.uploadContacts(new ContactUpload(request));
    }
}
