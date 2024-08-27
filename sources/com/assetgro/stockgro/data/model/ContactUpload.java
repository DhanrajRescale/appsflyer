package com.assetgro.stockgro.data.model;

import a3.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/assetgro/stockgro/data/model/ContactUpload;", HttpUrl.FRAGMENT_ENCODE_SET, "contacts", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/UploadContactItem;", "(Ljava/util/List;)V", "getContacts", "()Ljava/util/List;", "setContacts", "component1", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ContactUpload {
    public static final int $stable = 8;

    @SerializedName("contacts")
    @NotNull
    private List<UploadContactItem> contacts;

    public ContactUpload(@NotNull List<UploadContactItem> contacts) {
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        this.contacts = contacts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContactUpload copy$default(ContactUpload contactUpload, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = contactUpload.contacts;
        }
        return contactUpload.copy(list);
    }

    @NotNull
    public final List<UploadContactItem> component1() {
        return this.contacts;
    }

    @NotNull
    public final ContactUpload copy(@NotNull List<UploadContactItem> contacts) {
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        return new ContactUpload(contacts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ContactUpload) && Intrinsics.a(this.contacts, ((ContactUpload) other).contacts);
    }

    @NotNull
    public final List<UploadContactItem> getContacts() {
        return this.contacts;
    }

    public int hashCode() {
        return this.contacts.hashCode();
    }

    public final void setContacts(@NotNull List<UploadContactItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.contacts = list;
    }

    @NotNull
    public String toString() {
        return a.h("ContactUpload(contacts=", this.contacts, ")");
    }
}
