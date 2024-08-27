package com.assetgro.stockgro.ui.social.domain.model;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001d\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0007HÆ\u0003J1\u0010\u000f\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR%\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/assetgro/stockgro/ui/social/domain/model/BlockedUserList;", HttpUrl.FRAGMENT_ENCODE_SET, "users", "Ljava/util/ArrayList;", "Lcom/assetgro/stockgro/ui/social/domain/model/User;", "Lkotlin/collections/ArrayList;", "endOfResponse", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/ArrayList;Z)V", "getEndOfResponse", "()Z", "getUsers", "()Ljava/util/ArrayList;", "component1", "component2", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlockedUserList {
    public static final int $stable = 8;
    private final boolean endOfResponse;
    private final ArrayList<User> users;

    public BlockedUserList(ArrayList<User> arrayList, boolean z10) {
        this.users = arrayList;
        this.endOfResponse = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BlockedUserList copy$default(BlockedUserList blockedUserList, ArrayList arrayList, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = blockedUserList.users;
        }
        if ((i10 & 2) != 0) {
            z10 = blockedUserList.endOfResponse;
        }
        return blockedUserList.copy(arrayList, z10);
    }

    public final ArrayList<User> component1() {
        return this.users;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEndOfResponse() {
        return this.endOfResponse;
    }

    @NotNull
    public final BlockedUserList copy(ArrayList<User> users, boolean endOfResponse) {
        return new BlockedUserList(users, endOfResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockedUserList)) {
            return false;
        }
        BlockedUserList blockedUserList = (BlockedUserList) other;
        return Intrinsics.a(this.users, blockedUserList.users) && this.endOfResponse == blockedUserList.endOfResponse;
    }

    public final boolean getEndOfResponse() {
        return this.endOfResponse;
    }

    public final ArrayList<User> getUsers() {
        return this.users;
    }

    public int hashCode() {
        ArrayList<User> arrayList = this.users;
        return Boolean.hashCode(this.endOfResponse) + ((arrayList == null ? 0 : arrayList.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "BlockedUserList(users=" + this.users + ", endOfResponse=" + this.endOfResponse + ")";
    }

    public /* synthetic */ BlockedUserList(ArrayList arrayList, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, (i10 & 2) != 0 ? true : z10);
    }
}
