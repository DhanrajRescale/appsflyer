package com.assetgro.stockgro.ui.social.data.remote;

import com.assetgro.stockgro.ui.social.domain.model.BlockedUserList;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/assetgro/stockgro/ui/social/data/remote/BlockedUserListDto;", HttpUrl.FRAGMENT_ENCODE_SET, "users", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/ui/social/data/remote/UserDto;", "isEndOfResponse", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/List;Z)V", "()Z", "getUsers", "()Ljava/util/List;", "toBlockedUsers", "Lcom/assetgro/stockgro/ui/social/domain/model/BlockedUserList;", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlockedUserListDto {
    public static final int $stable = 8;

    @SerializedName("end_of_response")
    private final boolean isEndOfResponse;

    @SerializedName("users")
    private final List<UserDto> users;

    public BlockedUserListDto(List<UserDto> list, boolean z10) {
        this.users = list;
        this.isEndOfResponse = z10;
    }

    public final List<UserDto> getUsers() {
        return this.users;
    }

    /* renamed from: isEndOfResponse, reason: from getter */
    public final boolean getIsEndOfResponse() {
        return this.isEndOfResponse;
    }

    @NotNull
    public final BlockedUserList toBlockedUsers() {
        ArrayList arrayList;
        List<UserDto> list = this.users;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((UserDto) it.next()).toUser());
            }
        } else {
            arrayList = null;
        }
        return new BlockedUserList(arrayList, this.isEndOfResponse);
    }

    public /* synthetic */ BlockedUserListDto(List list, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? true : z10);
    }
}
