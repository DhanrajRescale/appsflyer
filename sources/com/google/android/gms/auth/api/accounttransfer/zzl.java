package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import nn.d;

@SafeParcelable.Class(creator = "AccountTransferMsgCreator")
/* loaded from: classes2.dex */
public final class zzl extends zzaz {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> zzaz;

    @SafeParcelable.Indicator
    private final Set<Integer> zzba;

    @SafeParcelable.Field(getter = "getAuthenticatorDatas", id = 2)
    private ArrayList<zzr> zzbb;

    @SafeParcelable.Field(getter = "getRequestType", id = 3)
    private int zzbc;

    @SafeParcelable.Field(getter = "getProgress", id = 4)
    private zzo zzbd;

    @SafeParcelable.VersionField(id = 1)
    private final int zzv;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        zzaz = hashMap;
        hashMap.put("authenticatorData", FastJsonResponse.Field.forConcreteTypeArray("authenticatorData", 2, zzr.class));
        hashMap.put("progress", FastJsonResponse.Field.forConcreteType("progress", 4, zzo.class));
    }

    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Indicator Set<Integer> set, @SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) ArrayList<zzr> arrayList, @SafeParcelable.Param(id = 3) int i11, @SafeParcelable.Param(id = 4) zzo zzoVar) {
        this.zzba = set;
        this.zzv = i10;
        this.zzbb = arrayList;
        this.zzbc = i11;
        this.zzbd = zzoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeArrayInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<T> arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.zzbb = arrayList;
            this.zzba.add(Integer.valueOf(safeParcelableFieldId));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(safeParcelableFieldId), arrayList.getClass().getCanonicalName()));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeInternal(FastJsonResponse.Field<?, ?> field, String str, T t10) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 4) {
            this.zzbd = (zzo) t10;
            this.zzba.add(Integer.valueOf(safeParcelableFieldId));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(safeParcelableFieldId), t10.getClass().getCanonicalName()));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map getFieldMappings() {
        return zzaz;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getFieldValue(FastJsonResponse.Field field) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 1) {
            if (safeParcelableFieldId != 2) {
                if (safeParcelableFieldId == 4) {
                    return this.zzbd;
                }
                throw new IllegalStateException(d.h(37, "Unknown SafeParcelable id=", field.getSafeParcelableFieldId()));
            }
            return this.zzbb;
        }
        return Integer.valueOf(this.zzv);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return this.zzba.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        Set<Integer> set = this.zzba;
        if (set.contains(1)) {
            SafeParcelWriter.writeInt(parcel, 1, this.zzv);
        }
        if (set.contains(2)) {
            SafeParcelWriter.writeTypedList(parcel, 2, this.zzbb, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.writeInt(parcel, 3, this.zzbc);
        }
        if (set.contains(4)) {
            SafeParcelWriter.writeParcelable(parcel, 4, this.zzbd, i10, true);
        }
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzl() {
        this.zzba = new HashSet(1);
        this.zzv = 1;
    }
}
