import { NgModule } from '@angular/core';
import {
  MatButtonModule, MatCardModule, MatInputModule, MatIconModule, MatTooltipModule,
  MatToolbar, MatToolbarModule, MatProgressSpinnerModule, MatDialogModule
} from '@angular/material';

@NgModule({
  imports: [
    MatButtonModule,
    MatCardModule,
    MatInputModule,
    MatIconModule,
    MatTooltipModule,
    MatToolbarModule,
    MatProgressSpinnerModule,
    MatDialogModule,
    MatToolbarModule,
  ],
  exports: [
    MatButtonModule,
    MatCardModule,
    MatInputModule,
    MatIconModule,
    MatTooltipModule,
    MatToolbarModule,
    MatProgressSpinnerModule,
    MatDialogModule,
    MatToolbarModule,
  ],
})
export class MaterialModule { }
