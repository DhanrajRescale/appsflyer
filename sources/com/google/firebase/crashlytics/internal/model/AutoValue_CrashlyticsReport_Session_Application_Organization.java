package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import nn.d;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Application_Organization extends CrashlyticsReport.Session.Application.Organization {
    private final String clsId;

    /* loaded from: classes2.dex */
    public static final class Builder extends CrashlyticsReport.Session.Application.Organization.Builder {
        private String clsId;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder
        public CrashlyticsReport.Session.Application.Organization build() {
            String str;
            if (this.clsId == null) {
                str = " clsId";
            } else {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Application_Organization(this.clsId);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder
        public CrashlyticsReport.Session.Application.Organization.Builder setClsId(String str) {
            if (str != null) {
                this.clsId = str;
                return this;
            }
            throw new NullPointerException("Null clsId");
        }

        public Builder() {
        }

        private Builder(CrashlyticsReport.Session.Application.Organization organization) {
            this.clsId = organization.getClsId();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Application.Organization) {
            return this.clsId.equals(((CrashlyticsReport.Session.Application.Organization) obj).getClsId());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization
    @NonNull
    public String getClsId() {
        return this.clsId;
    }

    public int hashCode() {
        return this.clsId.hashCode() ^ 1000003;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization
    public CrashlyticsReport.Session.Application.Organization.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return d.o(new StringBuilder("Organization{clsId="), this.clsId, UrlTreeKt.componentParamSuffix);
    }

    private AutoValue_CrashlyticsReport_Session_Application_Organization(String str) {
        this.clsId = str;
    }
}
