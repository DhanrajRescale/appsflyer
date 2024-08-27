package ls;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingService;

/* loaded from: classes2.dex */
public final class s0 extends FirebaseMessagingService {
    public static void c(String str) {
        n0.c(new r0(str, 0));
    }

    public static void d() {
        FirebaseInstanceId.getInstance().getInstanceId().addOnCompleteListener(new Object());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(47:1|(4:242|243|(6:246|(3:251|252|253)|254|255|253|244)|256)|3|(2:236|237)(1:5)|6|(41:8|(2:10|(4:12|(2:16|(1:(1:19))(1:227))|228|(0)(0))(4:229|(2:231|(0)(0))|228|(0)(0)))(4:232|(2:234|(0)(0))|228|(0)(0))|20|(1:22)|(27:223|224|25|(1:222)(1:29)|30|(1:221)(1:34)|35|(1:220)(1:39)|40|(1:219)(1:44)|(4:46|47|48|(1:50)(1:51))|54|(1:218)(1:58)|59|(5:209|210|211|(1:213)(1:215)|214)(1:63)|64|(1:(1:67)(1:68))|(1:70)|71|(10:74|(1:101)|76|77|78|79|80|(2:98|(7:88|89|90|91|(1:95)|93|94))|82|(9:84|86|88|89|90|91|(0)|93|94))|102|(2:125|(1:127)(2:128|(1:130)(2:131|(1:133)(29:134|(1:136)|137|(1:139)|140|(1:142)(1:208)|143|(2:145|(1:147)(2:148|(4:150|151|152|(1:154))(1:157)))|158|(1:207)(5:162|163|164|165|(1:167)(1:203))|168|(1:170)|171|(2:174|172)|175|176|(3:178|(1:180)|181)(1:202)|182|(1:184)|185|(1:187)(4:194|(1:196)|(1:198)|(1:200)(1:201))|188|(1:190)|191|(1:193)|105|(1:107)(1:124)|108|(5:110|(1:122)|114|115|(2:117|118)(2:120|121))(1:123)))))|104|105|(0)(0)|108|(0)(0))|24|25|(1:27)|222|30|(1:32)|221|35|(1:37)|220|40|(1:42)|219|(0)|54|(1:56)|218|59|(1:61)|209|210|211|(0)(0)|214|64|(0)|(0)|71|(10:74|(0)|76|77|78|79|80|(0)|82|(0))|102|(0)|104|105|(0)(0)|108|(0)(0))|235|20|(0)|(0)|24|25|(0)|222|30|(0)|221|35|(0)|220|40|(0)|219|(0)|54|(0)|218|59|(0)|209|210|211|(0)(0)|214|64|(0)|(0)|71|(0)|102|(0)|104|105|(0)(0)|108|(0)(0)|(1:(43:239|6|(0)|235|20|(0)|(0)|24|25|(0)|222|30|(0)|221|35|(0)|220|40|(0)|219|(0)|54|(0)|218|59|(0)|209|210|211|(0)(0)|214|64|(0)|(0)|71|(0)|102|(0)|104|105|(0)(0)|108|(0)(0)))) */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0256, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0155, code lost:
    
        if (r0 < 0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0296 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02cf  */
    /* JADX WARN: Type inference failed for: r11v6, types: [ls.v0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v3, types: [ls.t0, java.lang.Object] */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMessageReceived(com.google.firebase.messaging.r r31) {
        /*
            Method dump skipped, instructions count: 1520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.s0.onMessageReceived(com.google.firebase.messaging.r):void");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String str) {
        el.l.F("MixpanelAPI.MixpanelFCMMessagingService", "MP FCM on new push token: " + str);
        c(str);
    }
}
