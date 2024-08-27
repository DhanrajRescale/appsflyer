package nl;

import com.facebook.FacebookSdk;
import java.util.Arrays;

/* loaded from: classes.dex */
public enum i {
    Login(0),
    /* JADX INFO: Fake field, exist only in values array */
    Share(1),
    /* JADX INFO: Fake field, exist only in values array */
    Message(2),
    /* JADX INFO: Fake field, exist only in values array */
    Like(3),
    /* JADX INFO: Fake field, exist only in values array */
    GameRequest(4),
    /* JADX INFO: Fake field, exist only in values array */
    AppGroupCreate(5),
    /* JADX INFO: Fake field, exist only in values array */
    AppGroupJoin(6),
    /* JADX INFO: Fake field, exist only in values array */
    AppInvite(7),
    /* JADX INFO: Fake field, exist only in values array */
    DeviceShare(8),
    /* JADX INFO: Fake field, exist only in values array */
    GamingFriendFinder(9),
    /* JADX INFO: Fake field, exist only in values array */
    GamingGroupIntegration(10),
    /* JADX INFO: Fake field, exist only in values array */
    Referral(11),
    /* JADX INFO: Fake field, exist only in values array */
    GamingContextCreate(12),
    /* JADX INFO: Fake field, exist only in values array */
    GamingContextSwitch(13),
    /* JADX INFO: Fake field, exist only in values array */
    GamingContextChoose(14),
    /* JADX INFO: Fake field, exist only in values array */
    TournamentShareDialog(15),
    /* JADX INFO: Fake field, exist only in values array */
    TournamentJoinDialog(16);


    /* renamed from: a, reason: collision with root package name */
    public final int f28863a;

    i(int i10) {
        this.f28863a = i10;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static i[] valuesCustom() {
        return (i[]) Arrays.copyOf(values(), 17);
    }

    public final int a() {
        return FacebookSdk.getCallbackRequestCodeOffset() + this.f28863a;
    }
}
