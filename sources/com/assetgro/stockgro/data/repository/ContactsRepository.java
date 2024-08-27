package com.assetgro.stockgro.data.repository;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import at.m;
import at.o;
import com.assetgro.stockgro.data.model.NonStockgroContact;
import com.assetgro.stockgro.data.model.UploadContactItem;
import com.assetgro.stockgro.data.remote.NetworkService;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ContactResponseDto;
import com.assetgro.stockgro.data.remote.response.StockgroContact;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import kotlin.text.y;
import nt.d;
import nt.f;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import r3.k;
import vt.i0;
import yk.g;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b \u0010!J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\f0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\f0\u000bJ(\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\b0\u00120\u000b2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/assetgro/stockgro/data/repository/ContactsRepository;", HttpUrl.FRAGMENT_ENCODE_SET, "Landroid/database/Cursor;", "createContactsCursor", "createUploadContactsCursor", HttpUrl.FRAGMENT_ENCODE_SET, "phoneNumber", "cleanPhoneNumber", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/UploadContactItem;", "allContacts", "Lat/m;", "Lcom/assetgro/stockgro/data/remote/response/BaseResponseDto;", "uploadContacts", "Lcom/assetgro/stockgro/data/remote/response/StockgroContact;", "getStockgroContacts", "page", "search", "Lcom/assetgro/stockgro/data/remote/response/ContactResponseDto;", "Lcom/assetgro/stockgro/data/model/NonStockgroContact;", "getPhoneContacts", "retrieveAllContacts", "Landroid/content/Context;", LogCategory.CONTEXT, "Landroid/content/Context;", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "networkService", "Lcom/assetgro/stockgro/data/remote/NetworkService;", HttpUrl.FRAGMENT_ENCODE_SET, "getHasContactsPermission", "()Z", "hasContactsPermission", "<init>", "(Landroid/content/Context;Lcom/assetgro/stockgro/data/remote/NetworkService;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ContactsRepository {
    public static final int $stable = 8;

    @NotNull
    private final Context context;

    @NotNull
    private final NetworkService networkService;

    @Inject
    public ContactsRepository(@NotNull Context context, @NotNull NetworkService networkService) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        this.context = context;
        this.networkService = networkService;
    }

    private final String cleanPhoneNumber(String phoneNumber) {
        return y.b0(10, s.n(s.n(s.n(s.n(phoneNumber, " ", HttpUrl.FRAGMENT_ENCODE_SET, false), "-", HttpUrl.FRAGMENT_ENCODE_SET, false), "(", HttpUrl.FRAGMENT_ENCODE_SET, false), ")", HttpUrl.FRAGMENT_ENCODE_SET, false));
    }

    private final Cursor createContactsCursor() {
        Uri uri = ContactsContract.Contacts.CONTENT_URI;
        return this.context.getContentResolver().query(uri, new String[]{"has_phone_number", "_id"}, "has_phone_number> 0", null, null);
    }

    private final Cursor createUploadContactsCursor() {
        return this.context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"data1", "display_name"}, null, null, null);
    }

    private final boolean getHasContactsPermission() {
        if (k.checkSelfPermission(this.context, "android.permission.READ_CONTACTS") == 0) {
            return true;
        }
        return false;
    }

    public static final List uploadContacts$lambda$0(List allContacts) {
        Intrinsics.checkNotNullParameter(allContacts, "$allContacts");
        return allContacts;
    }

    public static final o uploadContacts$lambda$1(Function1 function1, Object obj) {
        return (o) a3.a.c(function1, "$tmp0", obj, "p0", obj);
    }

    @NotNull
    public final m<ContactResponseDto<List<NonStockgroContact>>> getPhoneContacts(@NotNull String page, @NotNull String search) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(search, "search");
        return this.networkService.getPhoneContacts(page, search);
    }

    @NotNull
    public final m<BaseResponseDto<List<StockgroContact>>> getStockgroContacts() {
        return this.networkService.getContacts("small");
    }

    @NotNull
    public final List<UploadContactItem> retrieveAllContacts() {
        if (!getHasContactsPermission()) {
            return i0.f38321a;
        }
        Cursor createUploadContactsCursor = createUploadContactsCursor();
        ArrayList arrayList = new ArrayList();
        if (createUploadContactsCursor != null) {
            try {
                int columnIndex = createUploadContactsCursor.getColumnIndex("data1");
                int columnIndex2 = createUploadContactsCursor.getColumnIndex("display_name");
                while (createUploadContactsCursor.moveToNext() && arrayList.size() < Integer.MAX_VALUE) {
                    String string = createUploadContactsCursor.getString(columnIndex);
                    Intrinsics.c(string);
                    String cleanPhoneNumber = cleanPhoneNumber(string);
                    String string2 = createUploadContactsCursor.getString(columnIndex2);
                    Intrinsics.c(string2);
                    arrayList.add(new UploadContactItem(string2, cleanPhoneNumber));
                }
                Unit unit = Unit.f23355a;
                g.k(createUploadContactsCursor, null);
            } finally {
            }
        }
        return arrayList;
    }

    @NotNull
    public final m<BaseResponseDto<Object>> uploadContacts(@NotNull List<UploadContactItem> allContacts) {
        Intrinsics.checkNotNullParameter(allContacts, "allContacts");
        f fVar = new f(new d(new j9.m(allContacts, 2), 1), new com.assetgro.stockgro.data.a(4, new ContactsRepository$uploadContacts$2(this)), 0);
        Intrinsics.checkNotNullExpressionValue(fVar, "flatMap(...)");
        return fVar;
    }
}
