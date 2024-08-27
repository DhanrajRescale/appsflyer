package ie;

import android.app.Application;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import android.view.MenuItem;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.members.compose.AddMembersHostComposeActivity;
import com.assetgro.stockgro.ui.chat.host.GroupChatHostViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import com.assetgro.stockgro.ui.chat.members.BannedMemberListViewModel;
import com.facebook.applinks.AppLinkData;
import com.firebase.ui.auth.viewmodel.email.EmailLinkSignInHandler;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import ek.h0;
import in.juspay.hypersdk.core.PaymentConstants;
import iu.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import m.p2;
import m.w;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements p2, et.c, OnFailureListener, qn.a, pn.h, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19933b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19934c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19935d;

    public /* synthetic */ n(int i10, Object obj, Object obj2, Object obj3) {
        this.f19932a = i10;
        this.f19933b = obj;
        this.f19934c = obj2;
        this.f19935d = obj3;
    }

    @Override // pn.h
    public final Object apply(Object obj) {
        int i10;
        gn.b bVar;
        gn.b bVar2;
        long insert;
        boolean z10;
        byte[] bArr;
        mn.c cVar = mn.c.CACHE_FULL;
        int i11 = 0;
        int i12 = this.f19932a;
        int i13 = 3;
        Object obj2 = this.f19935d;
        Object obj3 = this.f19934c;
        pn.j jVar = (pn.j) this.f19933b;
        switch (i12) {
            case 4:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                gn.b bVar3 = pn.j.f31244f;
                jVar.getClass();
                sQLiteDatabase.compileStatement((String) obj3).execute();
                pn.j.l(sQLiteDatabase.rawQuery((String) obj2, null), new pn.g(jVar, 1));
                sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                return null;
            case 5:
                List list = (List) obj3;
                jn.i iVar = (jn.i) obj2;
                Cursor cursor = (Cursor) obj;
                gn.b bVar4 = pn.j.f31244f;
                jVar.getClass();
                while (cursor.moveToNext()) {
                    long j10 = cursor.getLong(i11);
                    if (cursor.getInt(7) != 0) {
                        i10 = 1;
                    } else {
                        i10 = i11;
                    }
                    w wVar = new w(4);
                    wVar.f25765f = new HashMap();
                    String string = cursor.getString(1);
                    if (string != null) {
                        wVar.f25760a = string;
                        wVar.f25763d = Long.valueOf(cursor.getLong(2));
                        wVar.f25764e = Long.valueOf(cursor.getLong(3));
                        if (i10 != 0) {
                            String string2 = cursor.getString(4);
                            if (string2 == null) {
                                bVar2 = pn.j.f31244f;
                            } else {
                                bVar2 = new gn.b(string2);
                            }
                            wVar.i(new jn.l(bVar2, cursor.getBlob(5)));
                        } else {
                            String string3 = cursor.getString(4);
                            if (string3 == null) {
                                bVar = pn.j.f31244f;
                            } else {
                                bVar = new gn.b(string3);
                            }
                            wVar.i(new jn.l(bVar, (byte[]) pn.j.l(jVar.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new i5.w(15))));
                        }
                        if (!cursor.isNull(6)) {
                            wVar.f25761b = Integer.valueOf(cursor.getInt(6));
                        }
                        list.add(new pn.b(j10, iVar, wVar.c()));
                        i11 = 0;
                    } else {
                        throw new NullPointerException("Null transportName");
                    }
                }
                return null;
            case 6:
                Map map = (Map) obj3;
                h8.h hVar = (h8.h) obj2;
                Cursor cursor2 = (Cursor) obj;
                gn.b bVar5 = pn.j.f31244f;
                jVar.getClass();
                while (cursor2.moveToNext()) {
                    String string4 = cursor2.getString(0);
                    int i14 = cursor2.getInt(1);
                    mn.c cVar2 = mn.c.REASON_UNKNOWN;
                    if (i14 != 0) {
                        if (i14 == 1) {
                            cVar2 = mn.c.MESSAGE_TOO_OLD;
                        } else if (i14 == 2) {
                            cVar2 = cVar;
                        } else if (i14 == i13) {
                            cVar2 = mn.c.PAYLOAD_TOO_BIG;
                        } else if (i14 == 4) {
                            cVar2 = mn.c.MAX_RETRIES_REACHED;
                        } else if (i14 == 5) {
                            cVar2 = mn.c.INVALID_PAYLOD;
                        } else if (i14 == 6) {
                            cVar2 = mn.c.SERVER_ERROR;
                        } else {
                            al.d.b0("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i14));
                        }
                    }
                    long j11 = cursor2.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new mn.d(j11, cVar2));
                    i13 = 3;
                }
                for (Map.Entry entry : map.entrySet()) {
                    int i15 = mn.e.f27849c;
                    da.d dVar = new da.d(28);
                    dVar.f14276b = (String) entry.getKey();
                    dVar.f14277c = (List) entry.getValue();
                    ((List) hVar.f18057c).add(new mn.e((String) dVar.f14276b, Collections.unmodifiableList((List) dVar.f14277c)));
                }
                long a10 = ((rn.c) jVar.f31246b).a();
                SQLiteDatabase a11 = jVar.a();
                a11.beginTransaction();
                try {
                    Cursor rawQuery = a11.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        mn.h hVar2 = new mn.h(rawQuery.getLong(0), a10);
                        rawQuery.close();
                        a11.setTransactionSuccessful();
                        a11.endTransaction();
                        hVar.f18056b = hVar2;
                        h0 h0Var = new h0(7, i11);
                        mn.g gVar = new mn.g(jVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * jVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), pn.a.f31225f.f31226a);
                        h0Var.f15593b = gVar;
                        hVar.f18058d = new mn.b(gVar);
                        hVar.f18059e = (String) jVar.f31249e.get();
                        return new mn.a((mn.h) hVar.f18056b, Collections.unmodifiableList((List) hVar.f18057c), (mn.b) hVar.f18058d, (String) hVar.f18059e);
                    } catch (Throwable th2) {
                        rawQuery.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    a11.endTransaction();
                    throw th3;
                }
            default:
                jn.h hVar3 = (jn.h) obj3;
                jn.i iVar2 = (jn.i) obj2;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                gn.b bVar6 = pn.j.f31244f;
                long simpleQueryForLong = jVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * jVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                pn.a aVar = jVar.f31248d;
                if (simpleQueryForLong >= aVar.f31226a) {
                    jVar.c(new j5.l(hVar3.f21493a, 1L, cVar));
                    return -1L;
                }
                Long b10 = pn.j.b(sQLiteDatabase2, iVar2);
                if (b10 != null) {
                    insert = b10.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar2.f21499a);
                    contentValues.put("priority", Integer.valueOf(sn.a.a(iVar2.f21501c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr2 = iVar2.f21500b;
                    if (bArr2 != null) {
                        contentValues.put(AppLinkData.ARGUMENTS_EXTRAS_KEY, Base64.encodeToString(bArr2, 0));
                    }
                    insert = sQLiteDatabase2.insert("transport_contexts", null, contentValues);
                }
                byte[] bArr3 = hVar3.f21495c.f21510b;
                int length = bArr3.length;
                int i16 = aVar.f31230e;
                if (length <= i16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", hVar3.f21493a);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar3.f21496d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar3.f21497e));
                contentValues2.put("payload_encoding", hVar3.f21495c.f21509a.f17524a);
                contentValues2.put("code", hVar3.f21494b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z10));
                if (z10) {
                    bArr = bArr3;
                } else {
                    bArr = new byte[0];
                }
                contentValues2.put(PaymentConstants.PAYLOAD, bArr);
                long insert2 = sQLiteDatabase2.insert("events", null, contentValues2);
                if (!z10) {
                    int ceil = (int) Math.ceil(bArr3.length / i16);
                    for (int i17 = 1; i17 <= ceil; i17++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr3, (i17 - 1) * i16, Math.min(i17 * i16, bArr3.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i17));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase2.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry2 : Collections.unmodifiableMap(hVar3.f21498f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put(AppMeasurementSdk.ConditionalUserProperty.NAME, (String) entry2.getKey());
                    contentValues4.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) entry2.getValue());
                    sQLiteDatabase2.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
        }
    }

    @Override // et.c
    public final void b(Object obj) {
        String str;
        BannedMemberListViewModel this$0 = (BannedMemberListViewModel) this.f19933b;
        String role = (String) this.f19934c;
        String userId = (String) this.f19935d;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(role, "$role");
        Intrinsics.checkNotNullParameter(userId, "$userId");
        this$0.f9084g.postValue(Boolean.FALSE);
        if (role.equals("Rogue")) {
            str = "User Banned";
        } else {
            str = "User Unbanned";
        }
        this$0.f9411r.postValue(str);
        this$0.f9409p.postValue(userId);
    }

    @Override // qn.a
    public final Object execute() {
        nn.a aVar = (nn.a) this.f19933b;
        jn.i iVar = (jn.i) this.f19934c;
        jn.h hVar = (jn.h) this.f19935d;
        pn.j jVar = (pn.j) aVar.f28998d;
        jVar.getClass();
        Object[] objArr = {iVar.f21501c, hVar.f21493a, iVar.f21499a};
        String q02 = al.d.q0("SQLiteEventStore");
        if (Log.isLoggable(q02, 3)) {
            Log.d(q02, String.format("Storing event with priority=%s, name=%s for destination %s", objArr));
        }
        ((Long) jVar.c(new n(7, jVar, hVar, iVar))).longValue();
        ((on.c) aVar.f28995a).a(iVar, 1, false);
        return null;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        EmailLinkSignInHandler emailLinkSignInHandler = (EmailLinkSignInHandler) this.f19933b;
        im.b bVar = (im.b) this.f19934c;
        zp.d dVar = (zp.d) this.f19935d;
        Application e10 = emailLinkSignInHandler.e();
        bVar.getClass();
        im.b.a(e10);
        if (exc instanceof FirebaseAuthUserCollisionException) {
            emailLinkSignInHandler.i(dVar);
        } else {
            emailLinkSignInHandler.h(am.d.a(exc));
        }
    }

    @Override // m.p2
    public final boolean onMenuItemClick(MenuItem menuItem) {
        String groupId;
        GroupDetailHostActivity context = (GroupDetailHostActivity) this.f19933b;
        w this_apply = (w) this.f19934c;
        v isMuted = (v) this.f19935d;
        int i10 = GroupDetailHostActivity.f9382p;
        Intrinsics.checkNotNullParameter(context, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(isMuted, "$isMuted");
        int itemId = menuItem.getItemId();
        if (itemId != 4) {
            if (itemId != 5) {
                if (itemId != R.id.menu_options_add_members) {
                    if (itemId != R.id.menu_options_group_info) {
                        if (itemId == R.id.menu_options_invite_group) {
                            ((GroupChatHostViewModel) context.x()).m();
                            context.P("invite");
                        }
                    } else {
                        context.Q();
                    }
                } else {
                    Group group = (Group) ((GroupChatHostViewModel) context.x()).f9372q.getValue();
                    if (group != null && (groupId = group.getGroupId()) != null) {
                        int i11 = AddMembersHostComposeActivity.f9299k;
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intent intent = new Intent(context, (Class<?>) AddMembersHostComposeActivity.class);
                        intent.putExtra("CHAT_GROUP_ID", groupId);
                        context.startActivity(intent);
                    }
                }
            } else {
                context.L().l(R.id.moveToCommunityGuidelinesFragment, null, null);
                context.P("cg");
            }
        } else {
            ((GroupChatHostViewModel) context.x()).i(!isMuted.f20556a);
            context.P("mute");
        }
        return true;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        jr.e eVar;
        ir.b bVar = (ir.b) this.f19933b;
        Task task2 = (Task) this.f19934c;
        Task task3 = (Task) this.f19935d;
        bVar.getClass();
        if (task2.isSuccessful() && task2.getResult() != null) {
            jr.e eVar2 = (jr.e) task2.getResult();
            if (task3.isSuccessful() && (eVar = (jr.e) task3.getResult()) != null && eVar2.f21593c.equals(eVar.f21593c)) {
                return Tasks.forResult(Boolean.FALSE);
            }
            return bVar.f20502e.c(eVar2).continueWith(bVar.f20500c, new ir.a(bVar));
        }
        return Tasks.forResult(Boolean.FALSE);
    }
}
